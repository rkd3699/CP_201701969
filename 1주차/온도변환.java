
package ����;

import java.util.Scanner;

public class �µ���ȯ {

	public static void main(String[] args) {
		double C;
		double F;
		double FF;
		double FFF;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");

		F = input.nextDouble();
		FF = F - 32;
		FFF = FF * 5;
		C = FFF / 9;

		System.out.println(C);
	}
}