package kr.co.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명(), <생성자 함수>
		// new 니까 heap영역에 생성되고 monster는 해당 영억의 주소값을 가진다.
		Monster monster = new Monster();
		
		// 멤버 접근은 .(닷)노테이션으로 접근한다.
		// 변수명.메소드명
		System.out.println(monster.toString());
		monster.setName("오크");
		monster.setLevel(5);
		monster.setHp(100);
		System.out.println(monster.toString());
		//----------------------------------------------------
		Monster zombie = new Monster();
		zombie.setName("좀비");
		zombie.setLevel(10);
		zombie.setHp(220);
		System.out.println(zombie.toString());
		
		Weapon smasher = new Weapon();
		smasher.setName("몽둥이");
		smasher.setDamage(10);
		System.out.println(smasher.toString());
		
		monster.setWeapon(smasher);
		System.out.println(monster.toString());
		System.out.println(monster.getWeapon().getName());
		
		System.out.println("프로그램 종료");
	}

}
