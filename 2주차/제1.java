package ����2;

import java.util.Scanner;

public class ��1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int $;

		Scanner input = new Scanner(System.in);
		System.out.print("500�� ������ ������ �Է��Ͻÿ� :");
		a = input.nextInt();
		System.out.print("100�� ������ ������ �Է��Ͻÿ� :");
		b = input.nextInt();
		System.out.print("50�� ������ ������ �Է��Ͻÿ� :");
		c = input.nextInt();
		System.out.print("10�� ������ ������ �Է��Ͻÿ� :");
		d = input.nextInt();
		$ = 500 * a + 100 * b + 50 * c + 10 * d;
		System.out.print("�����뿡 ����ִ� ������ ���� :" + $ + "�Դϴ�.");
	}
}