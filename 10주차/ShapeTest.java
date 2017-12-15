package 과제10;

import java.util.Scanner;
public class ShapeTest {	
	public static void main(String arg[]) {
		
        Shape s = new Shape(); 
        Rectangle r = new Rectangle();
        Triangle t= new Triangle();
        Circle c = new Circle();
    
		Scanner input = new Scanner(System.in);
		System.out.println("가로를 입력해주세요");
		r.width = input.nextInt();
		System.out.println("세로를 입력해주세요");
		r.height = input.nextInt();
		System.out.println("가로를 입력해주세요");
		t.width = input.nextInt();
		System.out.println("세로를 입력해주세요");
		t.height = input.nextInt();
		System.out.println("반지름을 입력해주세요");
		c.width = input.nextInt();
	
		
	    double[] k = {r.area(), t.area(), c.area()};
    for (int i=0; i<k.length; i++) {
    	System.out.println(k[i]);
    }
	
	}
}