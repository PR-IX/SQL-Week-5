package entity;

public class carDetailsEntity {
	
	private int carDetailsId;
	private String carColor;
	private String carType;
	private String carInterior;
	
	public carDetailsEntity(int carDetailsId, String carColor, String carType, String carInterior) {
		this.setCarDetailsId(carDetailsId);
		this.setCarColor(carColor);
		this.setCarType(carType);
		this.setCarInterior(carInterior);
	}

	public int getCarDetailsId() {
		return carDetailsId;
	}

	public void setCarDetailsId(int carDetailsId) {
		this.carDetailsId = carDetailsId;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarInterior() {
		return carInterior;
	}

	public void setCarInterior(String carInterior) {
		this.carInterior = carInterior;
	}

}
