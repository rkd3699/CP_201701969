
package ����;

import java.util.Scanner;

public class ������ȯ2 {

	public static void main(String args[]) {
		int centi;
		int ft;
		double gg;

		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ���:");

		centi = input.nextInt();

		ft = (int) (centi / 12 / 2.54);
		gg = centi / 2.54;

		System.out.println(centi + "cm�� " + ft + "��Ʈ " + gg + "��ġ �Դϴ�.");
	}
}