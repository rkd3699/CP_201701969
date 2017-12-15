package 과제7;

public class PlaneTest {
	public static void main(String args[]) {
		Plane pa = new Plane("samsung", "zz123", 200);
		Plane ps = new Plane("LG");
		Plane pd = new Plane();
		System.out.println(pa.get제작사() + " " + pa.getModel() + " " + pa.getPeople());
		System.out.println(ps.get제작사() + " " + ps.getModel() + " " + ps.getPeople());
		System.out.println(pd.get제작사() + " " + pd.getModel() + " " + pd.getPeople());
        int n =Plane.getNumberOfplane();
        System.out.println(n);
	}
}

class Plane {
	private String 제작사;
	private String model;
	private int people;
	private int id;
	private static int NumberOfplane = 0 ;
	public String get제작사() {
		return 제작사;
	}

	public String getModel() {
		return model;
	}

	public int getPeople() {
		return people;
	}

	public void set제작사(String 제) {
		제작사 = 제;
	}

	public void setModel(String m) {
		model = m;
	}

	public void setPeople(int p) {
		people = p;
	}

	public Plane(String 제, String m, int p) {
		제작사 = 제;
		model = m;
		people = p;
		id= ++NumberOfplane;

	}

	public Plane(String 제) {
		제작사 = 제;
		model = "xx";
		people = 0;
		id= ++NumberOfplane;

	}

	public Plane() {
		제작사 = "xx";
		model = "xx";
		people = 0;
		id= ++NumberOfplane;
	}
	public static int getNumberOfplane() {
		return NumberOfplane;
	}
}