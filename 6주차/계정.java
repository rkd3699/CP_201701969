package ����6;

import java.util.Scanner;

public class ���� {
	public static void main(String args[]) {
		
		Ȯ�� Ȯ = new Ȯ��();
		Ȯ.���̵����();
		Ȯ.���̵�Ȯ��();
	}
}

class Ȯ�� {
	Scanner input = new Scanner(System.in);
	String id, pw;

	public void ���̵����() {
		System.out.println("���̵� �Է��Ͻÿ�");
		 id = input.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�");
		 pw = input.nextLine();
	
	}


	public void ���̵�Ȯ��() {
		
		String id1, pw1;
		System.out.print("id :");
		id1 = input.nextLine();
		System.out.print("pw :");
		pw1 = input.nextLine();

		if ((id).equals(id1) && (pw).equals(pw1)) {
			System.out.print("�α��� �Ǿ����ϴ�.");
		} else
			System.out.print("�α��ο� �����Ͽ����ϴ�.");
	}

	
}
