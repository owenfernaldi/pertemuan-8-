

public class Demo {
	

	public static void main(String[] args) {
		primeNumber prime = new primeNumber();
		Fibonaci fibo = new Fibonaci();
		prime.start();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		fibo.start();

	}
	
			}




