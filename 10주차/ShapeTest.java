package ����10;

import java.util.Scanner;
public class ShapeTest {	
	public static void main(String arg[]) {
		
        Shape s = new Shape(); 
        Rectangle r = new Rectangle();
        Triangle t= new Triangle();
        Circle c = new Circle();
    
		Scanner input = new Scanner(System.in);
		System.out.println("���θ� �Է����ּ���");
		r.width = input.nextInt();
		System.out.println("���θ� �Է����ּ���");
		r.height = input.nextInt();
		System.out.println("���θ� �Է����ּ���");
		t.width = input.nextInt();
		System.out.println("���θ� �Է����ּ���");
		t.height = input.nextInt();
		System.out.println("�������� �Է����ּ���");
		c.width = input.nextInt();
	
		
	    double[] k = {r.area(), t.area(), c.area()};
    for (int i=0; i<k.length; i++) {
    	System.out.println(k[i]);
    }
	
	}
}