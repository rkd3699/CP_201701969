package ����5;

public class Employee {
	public String �̸� ;
	public String ��ȭ��ȣ;
	public int ���� ;


	public String get�̸� (String a) {
		return �̸� = a;
	}

	public String get��ȭ��ȣ(String b) {
		return ��ȭ��ȣ = b;
	}

	public int get����(int c) {
		return ���� = c;
	}
	public void print() {
		System.out.println("������ �̸���"+get�̸�(�̸�));
		System.out.println("������ �̸���"+get��ȭ��ȣ(��ȭ��ȣ));
		System.out.println("������ �̸���"+get����(����));
	}
}
