package entities;

import java.util.ArrayList;
import java.util.List;

public class AutoSchool {

	private String name;
	private Double carCategoryValue;

	private List<Instructor> instructors = new ArrayList<>();
	private List<Pupil> pupils = new ArrayList<>();

	public AutoSchool() {

	}

	public AutoSchool(String name, Double carCategoryValue) {
		this.name = name;
		this.carCategoryValue = carCategoryValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCarCategoryValue() {
		return carCategoryValue;
	}

	public void setCarCategoryValue(Double carCategoryValue) {
		this.carCategoryValue = carCategoryValue;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);

	}

	public void removeInstructor(Instructor instructor) {
		instructors.remove(instructor);
	}

	public List<Pupil> getPupils() {
		return pupils;
	}

	public void addPupil(Pupil pupil) {
		pupils.add(pupil);
	}

	public void removePupil(Pupil pupil) {
		pupils.remove(pupil);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name of auto school -> ");
		sb.append(name + "\n");
		sb.append("Car Category Value:");
		sb.append(carCategoryValue + "\n");
		sb.append("\n");
		sb.append("Instructores \n");
		for(Instructor instructor : instructors) {
			sb.append(instructor + "\n");
		}
		sb.append("\n");
		sb.append("Pupils \n");
		for(Pupil pupil : pupils) {
			sb.append(pupil + "\n");
		}
		return sb.toString();
	}

}
