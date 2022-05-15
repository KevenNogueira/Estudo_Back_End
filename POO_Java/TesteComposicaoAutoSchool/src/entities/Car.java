package entities;

public class Car {

	private String model;
	private String plateNumber;
	private String brand;
	private String yearOfManufacture;

	public Car() {

	}

	public Car(String model, String plateNumber, String brand, String yearOfManufacture) {
		this.model = model;
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String toString() {
		return model + " . " + plateNumber + " . " + brand+ " . " + yearOfManufacture;
	}
}
