package ����7;

public class Dog {
	public static void main(String args[]) {
        Dog1 d1 = new Dog1("�����", "��Ƽ��", 3);
		d1.print(); //�ٸ� Ŭ������ ����Ʈ�� �������¹��
		Dog1 d2 = new Dog1("�ູ��" , 2);
	    d2.print();
	}
}

class Dog1 {
	private String name ;
	public static String breed;
	private int age;

	public Dog1(String n, String b, int a) { // ������ �̸��� ���� ������� Dog1
		name = n;
		breed = b;
		age = a;
	}


	public Dog1(String n, int a) { 
		name = n;
		breed = "��";
		age = a;
	
	}
	public void print() {
		System.out.println(name+" "+breed+" "+age);
	}

}