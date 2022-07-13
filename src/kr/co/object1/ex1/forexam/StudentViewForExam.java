package kr.co.object1.ex1.forexam;

public class StudentViewForExam {
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
}
