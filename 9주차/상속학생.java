package ����9;

public class ����л� {
	String name, number, major, grade, score;
	String ���Ƹ�;
	String ����;
	String scholarship;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}

class UnderGraduate extends ����л� {

	public UnderGraduate(String name, String number, String major, String grade, String score, String ���Ƹ�) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
		this.���Ƹ� = ���Ƹ�;
	}

	public String get���Ƹ�() {
		return ���Ƹ�;
	}

	public void setClub(String ���Ƹ�) {
		this.���Ƹ� = ���Ƹ�;
	}

	public void print() {
		System.out.println(name + "," + number + "," + major + "," + grade + "," + score + "," + ���Ƹ�);
	}
}

class Graduate extends ����л� {

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String getScholarship() {
		return scholarship;
	}

	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}

	public Graduate(String name, String number, String major, String grade, String score, String ����,
			String scholarship) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
		this.���� = ����;
		this.scholarship = scholarship;
	}

	public void print() {
		System.out
				.println(name + "," + number + "," + major + "," + grade + "," + score + "," + ���� + "," + scholarship);
	}

}
