
public class primeNumber extends Thread {
	public primeNumber() {
	
	}
	@Override
	public void run() {
		int i = 0;
		
		for (int j = 2;;j++) {
		if (j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0 || j == 2 || j == 3 || j == 5 || j == 7) {
			System.out.println(j);	
			i++;
			if (i == 10) {
				break;
			}
	}
				
	}
	}
}
