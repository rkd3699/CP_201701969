package ����9;

public class p264��2Test {
	public static void main(String[] args) {
		Person p = new Person("������", "������ ���縶��", "010-5183-7673");
		Customer c = new Customer("23����", 1000);
		System.out.println("�̸� : " + p.getName());
		System.out.println("�ּ� : " + p.getAddr());
		System.out.println("��ȭ��ȣ : " + p.getPhone());
		System.out.println("����ȣ : " + c.����ȣ);

		System.out.println("���ϸ��� : " + c.���ϸ���);
	}
}
