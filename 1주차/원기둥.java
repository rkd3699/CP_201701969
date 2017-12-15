package 과제;

import java.util.Scanner;

public class 원기둥 {

	public static void main(String[] args) {
		double 반지름;
		double 높이;
		double 부피;
		double 넓이;

		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오:");
		반지름 = input.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오:");

		높이 = input.nextDouble();

		넓이 = 반지름 * 반지름 * 3.141592;
		부피 = 높이 * 넓이;
		System.out.println(부피);
	}
}