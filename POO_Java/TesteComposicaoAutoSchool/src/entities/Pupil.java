package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pupil {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private Integer cpf;
	private Date birthDate;

	public Pupil() {

	}

	public Pupil(String name, Integer cpf, Date birthDate) {
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return name + " - " + sdf.format(birthDate) + " CPF: " + cpf;
	}

}
