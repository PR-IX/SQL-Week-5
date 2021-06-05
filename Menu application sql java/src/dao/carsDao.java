package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.carsEntity;

public class carsDao {
	
	private Connection connection;
	private carDetailsDao CarDetailsDao;
	private final String GET_CARS_QUERY = "SELECT * FROM cars";
	private final String GET_CAR_BY_ID_QUERY = "SELECT * FROM cars WHERE id = ?";
;	
	public carsDao() {
		connection = DBConnection.getConnection();
	}
	
	public List<carsEntity> getcars() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_CARS_QUERY).executeQuery();
		List<carsEntity> cars = new ArrayList<carsEntity>();
		
		while (rs.next()) {
			cars.add(populatecarsEntity(rs.getInt(1), rs.getString(2)));
		}
		
		return cars;
	}
	
	public carsEntity getCarById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_CAR_BY_ID_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return populatecarsEntity(rs.getInt(1), rs.getString(2));
	}
	private carsEntity populatecarsEntity(int id, String name) throws SQLException {
		return new carsEntity(id, name, CarDetailsDao.getcarDetailsBycarsId(id));
	}
}
