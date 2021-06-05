package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.carDetailsEntity;

public class carDetailsDao {
	
	private Connection connection;
	private final String GET_CAR_DETAILS_BY_ID_QUERY = "SELECT * FROM members WHERE cars_id = ?";
	
	public carDetailsDao() {
		connection = DBConnection.getConnection();
		
	}

	public List<carDetailsEntity> getcarDetailsBycarsId(int carsid) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_CAR_DETAILS_BY_ID_QUERY);
		ps.setInt(1, carsid);
		ResultSet rs = ps.executeQuery(); 
		List<carDetailsEntity> carDetailsEntitys = new ArrayList<carDetailsEntity>();
		
		while(rs.next()) {
			carDetailsEntitys.add(new carDetailsEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
;		return carDetailsEntitys;
	}

}

