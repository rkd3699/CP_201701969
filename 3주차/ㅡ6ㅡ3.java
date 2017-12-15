package 빡공;

import java.util.Scanner;

public class ㅡ6ㅡ3 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in) ;
		double 몸무게, 키 ;
		double 표준체중 ;
		System.out.print("사용자의 몸무게와 키를 차례로 입력하시오.");
		키 = input.nextInt();
		몸무게 = input.nextInt() ;
	
	    표준체중 = (키-100) * 9/10 ;
		if (몸무게 >표준체중*1.1)
		System.out.println("과체중 입니다.");
		
		else if(몸무게 < 표준체중*0.9)
		System.out.println("저체중 입니다.");
		
		else 
		System.out.println("정상체중 입니다.");
	} 

}
