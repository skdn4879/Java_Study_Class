package kr.co.object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scanner = new Scanner(System.in);
		
		Student[] students = new Student[0];
		int count = 0;
		
		System.out.print("학생 수 입력 : ");
		count = scanner.nextInt();
		
		//StudentController의 start메소드 호출
		StudentController sct = new StudentController();
		students = sct.init(count);
		sct.start(students);
		
		System.out.println("프로그램 종료");
	}

}
