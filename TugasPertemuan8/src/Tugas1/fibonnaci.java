package Tugas1;

public class fibonnaci implements Runnable {
	 
	public fibonnaci() {
		
	}	
		
		@Override
		public void run() {
			int h = 0;
			int g = 1;
			int k = 0;
				System.out.println(g);
			while (k<GanjilGenap.input) {
				k=h+g;
				h=g;
				g=k;
				
			}if (GanjilGenap.input == k ) {
				System.out.println("Angka Fibonnaci");
			}else {
				System.out.println("Bukan Fibonnaci");
			}
				
				
				
			
		}
		

}
