
public class Fibonaci extends Thread {
	int h = 0;
	int g = 1;
	int k;
	@Override
	public void run() {
		
			System.out.println(g);
			for (int i = 0; i < 20; i++) {
				k=h+g;
				System.out.println(k);
				h=g;
				g=k;
				
			}
			
		
	}

	

}
