package 과제5;

public class Employee {
	public String 이름 ;
	public String 전화번호;
	public int 연봉 ;


	public String get이름 (String a) {
		return 이름 = a;
	}

	public String get전화번호(String b) {
		return 전화번호 = b;
	}

	public int get연봉(int c) {
		return 연봉 = c;
	}
	public void print() {
		System.out.println("직원의 이름은"+get이름(이름));
		System.out.println("직원의 이름은"+get전화번호(전화번호));
		System.out.println("직원의 이름은"+get연봉(연봉));
	}
}
