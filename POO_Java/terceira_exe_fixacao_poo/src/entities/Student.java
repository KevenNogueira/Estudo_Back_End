package entities;

public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double finalNote() {
		return n1 + n2 + n3;
	}

	public double missingPoints() {
		if (finalNote() < 60.0) {
			return 60.0 - finalNote();
		} else {
			return 0.0;
		}
	}

}
