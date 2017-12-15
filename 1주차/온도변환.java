
package 과제;

import java.util.Scanner;

public class 온도변환 {

	public static void main(String[] args) {
		double C;
		double F;
		double FF;
		double FFF;
		Scanner input = new Scanner(System.in);
		System.out.print("섭씨를 입력하세요:");

		F = input.nextDouble();
		FF = F - 32;
		FFF = FF * 5;
		C = FFF / 9;

		System.out.println(C);
	}
}