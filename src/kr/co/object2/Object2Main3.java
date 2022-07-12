package kr.co.object2;

public class Object2Main3 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//월급 입력
		int salary = 5000000;
		
		Method3 mt = new Method3();
		mt.sal(salary);
		System.out.println(salary);
		
		mt.sum(10, 20);
		mt.info("Java", 30, "sunmicrosystems@sunmc.co.us");
		
		Member member = new Member();
		member.setName("Java");
		member.setAge(32);
		member.setEmail("sun@sunmc.co.us");
		member.setPhone("010-1111-2222");
		mt.info(member);
		System.out.println(member.getName());
		System.out.println(member.getAge());
		
		System.out.println("프로그램 종료");
	}

}
