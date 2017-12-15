
package 과제;

import java.util.Scanner;

public class 단위변환2 {

	public static void main(String args[]) {
		int centi;
		int ft;
		double gg;

		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하세요:");

		centi = input.nextInt();

		ft = (int) (centi / 12 / 2.54);
		gg = centi / 2.54;

		System.out.println(centi + "cm는 " + ft + "피트 " + gg + "인치 입니다.");
	}
}