package kr.co.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Student student = new Student();
		student.setName("Java");
		student.setNumber(1);
		student.setLangScore(95);
		student.setEngScore(92);
		student.setMathScore(98);
		student.setTotalScore(student.getLangScore() + student.getEngScore() + student.getMathScore());
		student.setAverScore(student.getTotalScore() / 3);
		
		System.out.println(student.toString());
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		for(int i = 0; i < 3; i ++) {
			st = new Student();
			System.out.print("이름 입력 : ");
			st.setName(sc.next());
			students[i] = st;
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName());
		}
		
		System.out.println("프로그램 종료");
	}

}
