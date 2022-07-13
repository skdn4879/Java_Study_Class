package kr.co.object3;

import java.util.Random;

public class ReturnTest {
	
	public Account makeAccount(String title, String host, String numbers, long balance) {
		Account account = new Account();
		account.setTitle(title);
		account.setHost(host);
		account.setNumbers(numbers);
		account.setBalance(balance);
		
		return account;
	}

	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		return num;
	}
	
	//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int[] makeRandom2(int count) {
		Random random = new Random();
		int[] randoms = new int[count];
		
		for(int i = 0; i < count; i++) {
			randoms[i] = random.nextInt(50);
		}
		
		return randoms;
	}
	
	public double[] makeRandom3(int count) {
		Random random = new Random();
		double[] randoms = new double[count];
		
		for(int i = 0; i < count; i++) {
			randoms[i] = random.nextDouble(50);
		}
		
		return randoms;
	}
	
}
