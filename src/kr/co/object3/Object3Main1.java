package kr.co.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		
		ReturnTest rt = new ReturnTest();
		
		rt.info();
		
		int num = rt.makeRandom();
		System.out.println("생성된 랜덤 숫자 : " + num);
		
		System.out.print("숫자 개수 입력 : ");
		int count = sc.nextInt();
		int[] nums = rt.makeRandom2(count);
		
		for(int i = 0; i < count; i++) {
			System.out.println("생성된 랜덤 숫자 : " + nums[i]);
		}
		
		double[] nums2 = rt.makeRandom3(count);
		
		for(int i = 0; i < count; i++) {
			System.out.println("생성된 랜덤 숫자 : " + nums2[i]);
		}
		
		System.out.print("이름 입력 : ");
		String title = sc.next();
		System.out.print("소유주 입력 : ");
		String host = sc.next();
		System.out.print("번호 입력 : ");
		String numbers = sc.next();
		System.out.print("금액 입력 : ");
		long balance = sc.nextLong();
		
		Account account = rt.makeAccount(title, host, numbers, balance);
		System.out.println(account.toString());
		System.out.println("금액 : " + account.getBalance());
		
		System.out.println("프로그램 종료");
	}

}
