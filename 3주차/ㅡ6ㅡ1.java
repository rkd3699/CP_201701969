package ����;

import java.util.Scanner;

public class ��6��1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int x, y, z;

		System.out.println("������ �Է��Ͻÿ�");
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
