package 과제9;

public class 상속Test {

	public static void main(String[] args) {
		UnderGraduate a = new UnderGraduate("강인한", "201701969", "컴공과", "1", "100", "admin");
		Graduate b = new Graduate("유승진", "201702044", "컴공과", "1", "100", "조교", "장학금 o");

		a.print();
		b.print();
	}

}
