package kr.co.object2;

public class Object2Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//멤버 메소드 사용(메소드를 호출)
		Method1 mt1 = new Method1();
		mt1.test();
		
		Method2 mt2 = new Method2();
		mt2.info();
		
		System.out.println("프로그램 종료");
	}

}
