package ����9;

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
	String ����ȣ;
	int ���ϸ���;

	public Customer() {
	}

	public Customer(String ����ȣ, int ���ϸ���) {
		super();
		this.����ȣ = ����ȣ;
		this.���ϸ��� = ���ϸ���;
	}
}
