package entity;

import java.util.List;

public class carsEntity {
	
	private int carsId;
	private String model;
	private List<carDetailsEntity> carDetailsEntity;
	
	
	public carsEntity(int carsId, String model, List<carDetailsEntity> carDetailsEntity) {
		this.setCarsId(carsId);
		this.setModel(model);
		this.setCarDetailsEntity(carDetailsEntity);
		
	}

	public int getCarsId() {
		return carsId;
	}

	public void setCarsId(int carsId) {
		this.carsId = carsId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<carDetailsEntity> getCarDetailsEntity() {
		return carDetailsEntity;
	}

	public void setCarDetailsEntity(List<carDetailsEntity> carDetailsEntity) {
		this.carDetailsEntity = carDetailsEntity;
	}

}
