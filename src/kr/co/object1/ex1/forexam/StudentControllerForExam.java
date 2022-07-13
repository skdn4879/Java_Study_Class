package kr.co.object1.ex1.forexam;

import java.util.Scanner;

public class StudentControllerForExam {
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		StudentForExam[] students = new StudentForExam[0];	//빈 학생 배열 선언
		int count = 0;	//학생 배열 길이 선언
		boolean isStudentsRegisted = false;	// 맨 처음 학생 정보 입력을 하지 않은 상태에서 다른 번호를 누를 경우를 방지하기 위한 변수
		
		while(isContinue) {
			
			System.out.println();	//콘솔 가독성을 위해
			System.out.print("1.학생 정보 입력, 2.학생 정보 조회, 3.학생 정보 검색, 4.학생 정보 삭제, 5.학생 정보 추가, 6.프로그램 종료 : ");
			int select = sc.nextInt();	//작업 번호 입력받음
			System.out.println();	//콘솔 가독성을 위해
			
			if(select == 1) {
				
				StudentServiceForExam service = new StudentServiceForExam();	//서비스 객체 생성
				students = service.makeStudents();	//서비스 객체의 메소드를 통해 학생 정보들을 입력후 주소값 배열 반환받음
				count = students.length;	//학생 배열 길이 계산 후 변수에 할당(굳이 없어도 될듯한데 혹시 모르니까)
				isStudentsRegisted = true;	//학생 정보들이 입력되었다고 설정
				
			} else if(select == 2 && isStudentsRegisted) {
				
				StudentViewForExam view = new StudentViewForExam();	//뷰 객체 생성
				view.viewAll(students);	// 학생 정보들 주소값 배열을 매개변수로 받아 모든 학생 정보를 출력
				
			} else if(select == 3 && isStudentsRegisted) {
				
			} else if(select == 4 && isStudentsRegisted) {
				
			} else if(select == 5 && isStudentsRegisted) {
				
			} else if(select == 6) {
				isContinue = !isContinue;	//종료
			} else {
				System.out.println("잘못된 입력이거나 학생 정보를 입력하지 않았습니다.");	// 잘못된 입력 방지문
			}
			
		}
		
	}
}
