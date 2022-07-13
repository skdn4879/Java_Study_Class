package kr.co.object3.forexam;

public class ReturnTestForExam {
	
	public AccountForExam makeAccount(String title, String host, String numbers, long balance) {
		AccountForExam account = new AccountForExam();	//어카운트 객체 생성
		account.title = title;
		account.host = host;
		account.numbers = numbers;
		account.balance = balance;	//매개변수로 입력받은 값들을 어카운트 객체의 멤버변수에 알맞게 할당
		
		return account;
	}
	
}
