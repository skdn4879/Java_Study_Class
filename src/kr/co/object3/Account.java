package kr.co.object3;

public class Account {

	private String title;	//
	private String host;
	private String numbers;
	private long balance;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [title=" + title + ", host=" + host + ", numbers=" + numbers + ", balance=" + balance + "]";
	}
	
	
	
}
