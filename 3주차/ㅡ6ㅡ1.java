package 빡공;

import java.util.Scanner;

public class ㅡ6ㅡ1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int x, y, z;

		System.out.println("정수를 입력하시오");
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		if (x > y && y> z)
		System.out.println(""+x + y + z );

		else if (x > z && z > y)
		System.out.println(""+x + z + y);

		else if (y > x && x > z)
		System.out.println(""+y + x + z);
		
		else if (y > z && z > x)
		System.out.println(""+y + z + x);
		
		else if (z > x && x > y)	
		System.out.println(""+z + x + y);
		
		else if (z > y && y > x)	
		System.out.println(""+z + y + x);
	}
}
