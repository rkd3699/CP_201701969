package ����7;

public class PlaneTest {
	public static void main(String args[]) {
		Plane pa = new Plane("samsung", "zz123", 200);
		Plane ps = new Plane("LG");
		Plane pd = new Plane();
		System.out.println(pa.get���ۻ�() + " " + pa.getModel() + " " + pa.getPeople());
		System.out.println(ps.get���ۻ�() + " " + ps.getModel() + " " + ps.getPeople());
		System.out.println(pd.get���ۻ�() + " " + pd.getModel() + " " + pd.getPeople());
        int n =Plane.getNumberOfplane();
        System.out.println(n);
	}
}

class Plane {
	private String ���ۻ�;
	private String model;
	private int people;
	private int id;
	private static int NumberOfplane = 0 ;
	public String get���ۻ�() {
		return ���ۻ�;
	}

	public String getModel() {
		return model;
	}

	public int getPeople() {
		return people;
	}

	public void set���ۻ�(String ��) {
		���ۻ� = ��;
	}

	public void setModel(String m) {
		model = m;
	}

	public void setPeople(int p) {
		people = p;
	}

	public Plane(String ��, String m, int p) {
		���ۻ� = ��;
		model = m;
		people = p;
		id= ++NumberOfplane;

	}

	public Plane(String ��) {
		���ۻ� = ��;
		model = "xx";
		people = 0;
		id= ++NumberOfplane;

	}

	public Plane() {
		���ۻ� = "xx";
		model = "xx";
		people = 0;
		id= ++NumberOfplane;
	}
	public static int getNumberOfplane() {
		return NumberOfplane;
	}
}