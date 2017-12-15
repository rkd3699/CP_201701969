package 과제9;

class Person {
	public String name, address, phone;

	public Person() {

	}

	public Person(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return address;
	}

	public void setAddr(String addr) {
		this.address = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class Customer extends Person{
	String 고객번호;
	int 마일리지;

	public Customer() {
	}

	public Customer(String 고객번호, int 마일리지) {
		super();
		this.고객번호 = 고객번호;
		this.마일리지 = 마일리지;
	}
}
