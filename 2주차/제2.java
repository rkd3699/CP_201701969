package 과제2;

import java.util.Scanner;

public class 제2 {
	public static void main(String args[]) {
		int a;
		Double b;
		Double c;
		Scanner input = new Scanner(System.in);
		System.out.print("평수를 입력하시오 :");
		a = input.nextInt();
		b = a * 3.3058;

		System.out.println(a + "평은" + b + "m2 입니다.");
	}
}
