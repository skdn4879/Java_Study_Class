package kr.co.object2;

import java.util.Scanner;

public class Method2 {
	//info 메소드 선언
	public void info() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		Method1 mt = new Method1();
		mt.test();
		
		System.out.println(name);
	}
}
