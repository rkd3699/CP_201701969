package ����8;

import java.util.Scanner;

public class cv {
	static int seat[] = new int[10];
	static int reserved;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0 )");
			int q = input.nextInt();
			if (q == 0)
				break;
			System.out.println("������ ������´� ������ �����ϴ�.");
			System.out.println("=============================");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			for (int i : seat)
				System.out.print(i + " ");
			System.out.println();
			System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
			reserved = input.nextInt();
			seat[reserved - 1] = 1;
			System.out.println("����Ǿ����ϴ�.");
		}
		System.out.println("���α׷��� �����մϴ�.");
		
	}
}
