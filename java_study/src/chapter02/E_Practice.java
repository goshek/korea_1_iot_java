package chapter02;

import java.util.Scanner;

public class E_Practice {
	/*
	 main 메소드
	 main +자동 완성(ctrl+ space)
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean isRun= true;
		System.out.println("프로그램 시작");
		while(isRun) {
			System.out.println("--------Main menu-------");
			System.out.println("|1. 회원 등록             |");
			System.out.println("|2. 회원 조회             |");
			System.out.println("|3. 회원 탈퇴             |");
			System.out.println("|q. 프로그램 종료          |");
			System.out.println("------------------------");
			
			System.out.println("메뉴 선택: ");
			// .nextLine();: 개행문자(enter키 값, 줄바꿈)까지 처리
			String selectedMenu= sc.nextLine();
			switch(selectedMenu) {
			case "1":
				System.out.println("회원 등록 기능입니다.");
				break;
			case "2":
				System.out.println("회원 이름으로 조회합니다.");
				break;
			case "3":
				System.out.println("회원 이름으로 탈퇴합니다.");
				break;
			case "q":
				System.out.println("시스템을 종료합니다.");
				isRun= false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}












