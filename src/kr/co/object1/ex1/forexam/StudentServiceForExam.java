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
	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서, 같은 번호의 학생을 찾아서 그 학생 한명을 리턴, 없으면 null을 리턴
	public StudentForExam findStudent(StudentForExam[] students) {
		Scanner sc = new Scanner(System.in);
		int count = students.length;
		
		System.out.println("총 학생 수 : " + count);
		
		for(int i = 0; i < count; i++) {
			
			System.out.print(students[i].number + "." + students[i].name + "\t");
			
			if(i % 5 == 0 && i != 0) {
				System.out.println();
			}
		}	//콘솔 가독성을 위해 어떤 학생들이 있는지를 출력
		
		System.out.println();
		System.out.print("검색할 학생 번호 입력 : ");
		int num = sc.nextInt();					//학생 번호 입력
		
		StudentForExam student = null;
		
		for(int i = 0; i < count; i++) {
			
			if(students[i].number == num) {		//입력된 학생 번호와 같은 학번의 학생 객체가 있으면
				student = students[i];			//전달할 학생 객체의 주소값을 받음
				break;
			}
			
		}
		
		/*for(StudentForExam studentFor : students) {
			if(studentFor.number == num) {
				student = studentFor;
				break;
			}
		}*/	//위의 for문과 같은 역할(향상된 for문)
		
		return student;
		
	}
	
}
