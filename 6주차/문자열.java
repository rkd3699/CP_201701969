package ����6;

import java.util.Scanner;


public class ���ڿ� {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		�Ųٷ� �� = new �Ųٷ�();
		String str;
		System.out.println("���ڿ��� �Է��Ͻÿ�:");
		str = input.nextLine();
		��.reverse(str);
    
	}

}
class �Ųٷ� {
	public void reverse(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
