package kr.co.object1.ex1.forexam;

public class StudentMainForExam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		StudentControllerForExam controller = new StudentControllerForExam();	//컨트롤러 객체 생성
		
		controller.start();
		
		System.out.println("프로그램 종료");
	}

}
