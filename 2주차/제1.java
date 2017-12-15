package 과제2;

import java.util.Scanner;

public class 제1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int $;

		Scanner input = new Scanner(System.in);
		System.out.print("500원 동전의 개수를 입력하시오 :");
		a = input.nextInt();
		System.out.print("100원 동전의 개수를 입력하시오 :");
		b = input.nextInt();
		System.out.print("50원 동전의 개수를 입력하시오 :");
		c = input.nextInt();
		System.out.print("10원 동전의 개수를 입력하시오 :");
		d = input.nextInt();
		$ = 500 * a + 100 * b + 50 * c + 10 * d;
		System.out.print("저금통에 들어있는 동전의 합은 :" + $ + "입니다.");
	}
}