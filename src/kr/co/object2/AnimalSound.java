package kr.co.object2;

public class AnimalSound {

	public void dogSound() {
		System.out.println("왈왈 크르릉 컹컹");
	}
	
	public void catSound() {
		System.out.println("애용 떼껄룩");
	}
	
	public void tigerSound() {
		System.out.println("어흥 roer");
	}
	
	public void sayAgain(int select, int count) {
		for(int i = 0; i < count; i++) {
			if(select == 1) {
				dogSound();
			} else if(select == 2) {
				catSound();
			} else if(select == 3) {
				tigerSound();
			} else {
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
}
