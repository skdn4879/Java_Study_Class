package kr.co.object1.ex1.forexam;

public class StudentViewForExam {
	
	//어차피 아래 메소드들은 출력만 담당(기능이 동일)하고 리턴타입도 동일하니 메소드 오버로딩으로 처리할 수 있다.
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	public void viewAll(StudentForExam[] students) {	//학생 정보 주소값을 가지는 배열을 매개변수로 받음
		int count = students.length;	//학생 수
		
		System.out.println("====================================================================================================================");
		System.out.println("\t이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
		for(int i = 0; i < count; i++) {
			System.out.println("\t" + students[i].name + "\t\t" + students[i].number + "\t\t" + students[i].langScore + "\t\t"
		+ students[i].engScore + "\t\t" + students[i].mathScore + "\t\t" + students[i].totalScore + "\t\t" + students[i].averScore);
		}//학생 수 만큼 반복
		System.out.println("====================================================================================================================");
	
	}
	
	//viewOne
	// 학생 한명의 정보를 받아서 모든 정보 출력
	public void viewOne(StudentForExam student) {	//학생 객체의 주소를 매개변수로 받아
		
		System.out.println("====================================================================================================================");
		System.out.println("\t이름\t\t번호\t\t국어점수\t\t영어점수\t\t수학점수\t\t총점\t\t평균");
		System.out.println("\t" + student.name + "\t\t" + student.number + "\t\t" +
				student.langScore + "\t\t" + student.engScore + "\t\t" + student.mathScore + 
		"\t\t" + student.totalScore + "\t\t" + student.averScore);
		System.out.println("===================================================================================================================="); //출력
		
	}
	
	//viewMessage 문자열을 받아서 그 문자열을 출력
	public void viewMessage(String message) {
		
		System.out.println("출력문구 : " + message);
		
	}
	
	//어차피 위 메소드들은 출력만 담당(기능이 동일)하고 리턴타입도 동일하니 메소드 오버로딩으로 처리할 수 있다.
	
	public void view(StudentForExam[] students) {
		int count = students.length;	//학생 수
		
		System.out.println("====================================================================================================================");
		System.out.println("\t이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
		for(int i = 0; i < count; i++) {
			System.out.println("\t" + students[i].name + "\t\t" + students[i].number + "\t\t" + students[i].langScore + "\t\t"
		+ students[i].engScore + "\t\t" + students[i].mathScore + "\t\t" + students[i].totalScore + "\t\t" + students[i].averScore);
		}//학생 수 만큼 반복
		System.out.println("====================================================================================================================");
	}
	
	public void view(StudentForExam student) {
		System.out.println("====================================================================================================================");
		System.out.println("\t이름\t\t번호\t\t국어점수\t\t영어점수\t\t수학점수\t\t총점\t\t평균");
		System.out.println("\t" + student.name + "\t\t" + student.number + "\t\t" +
				student.langScore + "\t\t" + student.engScore + "\t\t" + student.mathScore + 
		"\t\t" + student.totalScore + "\t\t" + student.averScore);
		System.out.println("====================================================================================================================");
	}
	
	public void view(String message) {
		System.out.println("출력문구 : " + message);
	}
}
