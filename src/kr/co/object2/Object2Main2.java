package kr.co.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.개, 2.고양이, 3.호랑이 : ");
		int select = sc.nextInt();
		System.out.print("횟수 입력 : ");
		int count = sc.nextInt();
		
		AnimalSound animalSound = new AnimalSound();
		
		animalSound.sayAgain(select, count);
		
		/*if(select == 1) {
			animalSound.dogSound();
		} else if(select == 2) {
			animalSound.catSound();
		} else if(select == 3) {
			animalSound.tigerSound();
		} else {
			System.out.println("잘못된 입력");
		}*/
	}

}
