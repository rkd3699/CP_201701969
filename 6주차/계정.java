package 과제6;

import java.util.Scanner;

public class 계정 {
	public static void main(String args[]) {
		
		확인 확 = new 확인();
		확.아이디생성();
		확.아이디확인();
	}
}

class 확인 {
	Scanner input = new Scanner(System.in);
	String id, pw;

	public void 아이디생성() {
		System.out.println("아이디를 입력하시오");
		 id = input.nextLine();
		System.out.println("비밀번호를 입력하시오");
		 pw = input.nextLine();
	
	}


	public void 아이디확인() {
		
		String id1, pw1;
		System.out.print("id :");
		id1 = input.nextLine();
		System.out.print("pw :");
		pw1 = input.nextLine();

		if ((id).equals(id1) && (pw).equals(pw1)) {
			System.out.print("로그인 되었습니다.");
		} else
			System.out.print("로그인에 실패하였습니다.");
	}

	
}
