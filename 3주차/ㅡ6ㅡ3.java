package ����;

import java.util.Scanner;

public class ��6��3 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in) ;
		double ������, Ű ;
		double ǥ��ü�� ;
		System.out.print("������� �����Կ� Ű�� ���ʷ� �Է��Ͻÿ�.");
		Ű = input.nextInt();
		������ = input.nextInt() ;
	
	    ǥ��ü�� = (Ű-100) * 9/10 ;
		if (������ >ǥ��ü��*1.1)
		System.out.println("��ü�� �Դϴ�.");
		
		else if(������ < ǥ��ü��*0.9)
		System.out.println("��ü�� �Դϴ�.");
		
		else 
		System.out.println("����ü�� �Դϴ�.");
	} 

}
