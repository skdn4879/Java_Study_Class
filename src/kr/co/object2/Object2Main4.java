package kr.co.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setName("yudang");
		member.setAge(20);
		member.setEmail("yudang@naver.com");
		
		Member member2 = new Member();
		member2.setName("cherry");
		member2.setAge(26);
		member2.setEmail("cherry@naver.com");
		
		Member member3 = new Member();
		member3.setName("boolya");
		member3.setAge(22);
		member3.setEmail("boolya@naver.com");
		
		Member[] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 mt = new Method4();
		mt.info(members);
		
		System.out.println(members.length);
		
	}

}
