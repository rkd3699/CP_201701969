package 과제9;

public class 상속학생 {
	String name, number, major, grade, score;
	String 동아리;
	String 조교;
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

class UnderGraduate extends 상속학생 {

	public UnderGraduate(String name, String number, String major, String grade, String score, String 동아리) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
		this.동아리 = 동아리;
	}

	public String get동아리() {
		return 동아리;
	}

	public void setClub(String 동아리) {
		this.동아리 = 동아리;
	}

	public void print() {
		System.out.println(name + "," + number + "," + major + "," + grade + "," + score + "," + 동아리);
	}
}

class Graduate extends 상속학생 {

	public String get조교() {
		return 조교;
	}

	public void set조교(String 조교) {
		this.조교 = 조교;
	}

	public String getScholarship() {
		return scholarship;
	}

	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}

	public Graduate(String name, String number, String major, String grade, String score, String 조교,
			String scholarship) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
		this.조교 = 조교;
		this.scholarship = scholarship;
	}

	public void print() {
		System.out
				.println(name + "," + number + "," + major + "," + grade + "," + score + "," + 조교 + "," + scholarship);
	}

}
