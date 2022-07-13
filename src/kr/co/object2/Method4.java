package kr.co.object2;

public class Method4 {

	public void info(Member[] members) {
		for(int i = 0; i < members.length; i++) {
			System.out.println("이름 : " + members[i].getName() + "\t나이 : " + members[i].getAge() 
					+ " \t이메일 : " + members[i].getEmail());
		}
	}
	
}
