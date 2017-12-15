package 과제6;

import java.util.Scanner;


public class 문자열 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		거꾸로 거 = new 거꾸로();
		String str;
		System.out.println("문자열을 입력하시오:");
		str = input.nextLine();
		거.reverse(str);
    
	}

}
class 거꾸로 {
	public void reverse(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
