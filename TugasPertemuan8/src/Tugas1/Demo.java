package Tugas1;

public class Demo {

	public static void main(String[] args) {
		fibonnaci fibos = new fibonnaci();
		GanjilGenap gangen = new GanjilGenap();
		
		gangen.run();
		try {
			Thread.sleep(30000);
		} catch (Exception e) {
			// TODO: handle exception
		}fibos.run();
	}

}
