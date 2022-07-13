package kr.co.object3.forexam;

import java.util.Scanner;

public class Object3MainForExam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		
		ReturnTestForExam returnTestForExam = new ReturnTestForExam();	//객체 생성
		
		System.out.print("이름 입력 : ");
		String title = sc.next();
		System.out.print("소유주 입력 : ");
		String host = sc.next();
		System.out.print("번호 입력 : ");
		String numbers = sc.next();
		System.out.print("금액 입력 : ");
		long balance = sc.nextLong();	//값 입력

		AccountForExam account = returnTestForExam.makeAccount(title, host, numbers, balance);	//메소드를 호출해 어카운트 주소값 반환받음
		System.out.println(account.balance);	//금액 출력
		
		System.out.println("프로그램 종료");
	}

}
