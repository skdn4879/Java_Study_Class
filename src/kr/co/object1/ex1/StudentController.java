package kr.co.object1.ex1;

import java.util.Scanner;

public class StudentController {
	
	public Scanner sc = new Scanner(System.in);
	
	public Student[] init(int count) {
		
		Student[] students = new Student[count];
		
		for(int i = 0; i < count; i++) {
			System.out.println("=============================");
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("번호 입력 : ");
			int number = sc.nextInt();
			System.out.print("국어 점수 입력 : ");
			int langScore = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			int engScore = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			int mathScore = sc.nextInt();
			int totalScore = langScore + engScore + mathScore;
			int averScore = totalScore / 3;
			Student student = new Student(name, number, langScore, engScore, mathScore, totalScore, averScore);
			students[i] = student;
			System.out.println("=============================");
		}
		
		return students;
		
	}
	
	public void start(Student[] students) {
		
		/*students를 받으면 private students해놓고 여기서 set(this.students)를 하면 굳이 다른 메소드에 매개변수로 안줘도 되지않을까?
		 * 어차피 이 클래스 내부의 메소드는 이 안에서 호출되니까 students와 count를 멤버변수로 해놓고 매개변수없이 this. 으로 호출?*/
		
		boolean isContinue = true;
		int count = students.length;
		boolean isStudentsRegisted = false;
		
		while(isContinue) {
			System.out.print("1.학생 정보 조회, 2.학생 정보 검색, 3.학생 정보 삭제, 4.학생 정보 추가, 5.프로그램 종료 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				showAllStudents(students, count);
				isStudentsRegisted = true;
			} else if(select == 2 && isStudentsRegisted) {
				showStudent(students, count);
			} else if(select == 3 && isStudentsRegisted) {
				StudentContainer stcon = deleteStudent(students, count);
				students = stcon.getCopyStudents();
				count = stcon.getCount();
			} else if(select == 4 && isStudentsRegisted) {
				StudentContainer stcon = addStudent(students, count);
				students = stcon.getCopyStudents();
				count = stcon.getCount();
			} else if(select == 5) {
				isContinue = !isContinue;
			} else {
				System.out.println("잘못된 입력이거나 학생 정보를 입력하지 않았습니다.");
			}
		}
		
	}
	
	public void showAllStudents(Student[] students, int count) {
		
		System.out.println("==========================================================");
		System.out.println("\t이름\t\t번호\t\t총점\t\t평균");
		for(int i = 0; i < count; i++) {
			System.out.println("\t" + students[i].getName() + "\t\t" + students[i].getNumber() + "\t\t" 
		+ students[i].getTotalScore() + "\t\t" + students[i].getAverScore());
		}
		System.out.println("==========================================================");
		
	}
	
	public void showStudent(Student[] students, int count) {
		
		System.out.println("총 학생 수 : " + count);
		
		for(int i = 0; i < count; i++) {
			System.out.print(students[i].getNumber() + "." + students[i].getName() + "\t");
			if(i % 5 == 0 && i != 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.print("검색할 학생 번호 입력 : ");
		int num = sc.nextInt();
		boolean isExist = false;
		
		for(int i = 0; i < count; i++) {
			if(students[i].getNumber() == num) {
				isExist = !isExist;
				System.out.println("====================================================================================================================");
				System.out.println("\t이름\t\t번호\t\t국어점수\t\t영어점수\t\t수학점수\t\t총점\t\t평균");
				System.out.println("\t" + students[i].getName() + "\t\t" + students[i].getNumber() + "\t\t" +
				students[i].getLangScore() + "\t\t" + students[i].getEngScore() + "\t\t" + students[i].getMathScore() + 
				"\t\t" + students[i].getTotalScore() + "\t\t" + students[i].getAverScore());
				System.out.println("====================================================================================================================");
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("없는 학번입니다.");
		}
	}
	
	public StudentContainer deleteStudent(Student[] students, int count) {
		System.out.println("총 학생 수 : " + count);
		
		for(int i = 0; i < count; i++) {
			System.out.print(students[i].getNumber() + "." + students[i].getName() + "\t");
			if(i % 5 == 0 && i != 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.print("삭제할 학생 번호 입력 : ");
		int num = sc.nextInt();
		int targetIndex = 0;
		boolean isExist = false;
		
		for(int i = 0; i < count; i++) {
			if(students[i].getNumber() == num) {
				isExist = !isExist;
				targetIndex = i;
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("없는 학번입니다.");
		} else {
			Student[] copyStudents = new Student[count - 1];
			
			for(int i = 0; i < targetIndex; i++) {
				copyStudents[i] = students[i];
			}
			for(int i = targetIndex + 1; i < count; i++) {
				copyStudents[i - 1] = students[i];
			}
			
			students = copyStudents;
			count--;
			System.out.println(num + "번 학생 삭제 완료");
		}
		
		StudentContainer studentContainer = new StudentContainer(count, students);
		
		/*studentContainer.setCount(count);
		studentContainer.setCopyStudents(students);*/
		
		return studentContainer;
	}
	
	public StudentContainer addStudent(Student[] students, int count) {
		
		Student[] copyStudents = new Student[count + 1];
		
		for(int i = 0; i < count; i++) {
			copyStudents[i] = students[i];
		}
		
		System.out.println("=============================");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("번호 입력 : ");
		int number = sc.nextInt();
		System.out.print("국어 점수 입력 : ");
		int langScore = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int engScore = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int mathScore = sc.nextInt();
		int totalScore = langScore + engScore + mathScore;
		int averScore = totalScore / 3;
		Student freshman = new Student(name, number, langScore, engScore, mathScore, totalScore, averScore);
		System.out.println("=============================");
		
		copyStudents[count] = freshman;
		
		students = copyStudents;
		count++;
		
		StudentContainer studentContainer = new StudentContainer(count, students);
		
		System.out.println("학생 추가 완료");
		
		return studentContainer;
	}
}
