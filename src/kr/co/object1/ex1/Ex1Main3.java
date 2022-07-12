package kr.co.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			Student st = new Student();
			students[i] = st;
			System.out.print("이름 입력 : ");
			st.setName(sc.next());
			//students[i].setName(sc.next());
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName());
		}
		
		System.out.println("프로그램 종료");
	}

}
