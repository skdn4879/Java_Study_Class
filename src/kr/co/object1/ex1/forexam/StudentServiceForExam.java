package kr.co.object1.ex1.forexam;

import java.util.Scanner;

public class StudentServiceForExam {
	//makeStudents
	//인원 수를 입력받고 학생 수만큼 정보를 입력받고 객체 생성
	public StudentForExam[] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int count = sc.nextInt();
		StudentForExam[] students = new StudentForExam[count];	//학생 수 크기만큼 학생 정보 배열 생성
		
		for(int i = 0; i < count; i++) {
			System.out.println("=============================");
			System.out.print("이름 입력 : ");
			String name = sc.next();							//이름
			System.out.print("번호 입력 : ");
			int number = sc.nextInt();							//학번
			System.out.print("국어 점수 입력 : ");
			int langScore = sc.nextInt();						//국어점수
			System.out.print("영어 점수 입력 : ");
			int engScore = sc.nextInt();						//영어점수
			System.out.print("수학 점수 입력 : ");
			int mathScore = sc.nextInt();						//수학점수
			int totalScore = langScore + engScore + mathScore;	//총점
			int averScore = totalScore / 3;						//평균
			System.out.println("=============================");	//학생 정보 입력받음
			
			StudentForExam student = new StudentForExam();	//학생 객체 생성
			student.name = name;
			student.number = number;
			student.langScore = langScore;
			student.engScore = engScore;
			student.mathScore = mathScore;
			student.totalScore = totalScore;
			student.averScore = averScore;		// 생성된 학생 객체에 학생 정보 할당
			
			students[i] = student;	//학생 배열에 학생 주소값 할당
		}
		
		return students;	//학생 배열 반환
	}
}
