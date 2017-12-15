package 과제7;

public class Dog {
	public static void main(String args[]) {
        Dog1 d1 = new Dog1("사랑이", "말티즈", 3);
		d1.print(); //다른 클래스의 프린트를 가져오는방법
		Dog1 d2 = new Dog1("행복이" , 2);
	    d2.print();
	}
}

class Dog1 {
	private String name ;
	public static String breed;
	private int age;

	public Dog1(String n, String b, int a) { // 생성자 이름을 같게 해줘야함 Dog1
		name = n;
		breed = b;
		age = a;
	}


	public Dog1(String n, int a) { 
		name = n;
		breed = "모름";
		age = a;
	
	}
	public void print() {
		System.out.println(name+" "+breed+" "+age);
	}

}