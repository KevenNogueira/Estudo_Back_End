package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Instructor {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private Integer cpf;
	private Date birthDate;

	private Car car;

	public Instructor() {

	}

	public Instructor(String name, Integer cpf, Date birthDate, Car car) {
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getBrithDate() {
		return birthDate;
	}

	public void setBrithDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String toString() {
		return name + " - " + sdf.format(birthDate) + " CPF: " + cpf + " Domain car: " + car;
	}

}
