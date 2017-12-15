package 과제9;

public class p264ㅡ2Test {
	public static void main(String[] args) {
		Person p = new Person("강인한", "세종시 가재마을", "010-5183-7673");
		Customer c = new Customer("23번고객", 1000);
		System.out.println("이름 : " + p.getName());
		System.out.println("주소 : " + p.getAddr());
		System.out.println("전화번호 : " + p.getPhone());
		System.out.println("고객번호 : " + c.고객번호);

		System.out.println("마일리지 : " + c.마일리지);
	}
}
