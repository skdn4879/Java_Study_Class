package kr.co.object2;

public class Method3 {
	
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println("실급여 : " + (int)(salary * 0.967) + "원");
		salary = 20;
		
	}
	
	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void info(String name, int age, String emailAddress) {
		System.out.println("이름 : " + name + "\t나이 : " + age + "\t\t이메일 : " + emailAddress);
	}
	
	public void info(Member member) {
		System.out.println("이름 : " + member.getName() + "\t나이 : " + member.getAge() + "\t\t이메일 : " + member.getEmail() 
		+ "\t폰 : " + member.getPhone());
	}
	
}
