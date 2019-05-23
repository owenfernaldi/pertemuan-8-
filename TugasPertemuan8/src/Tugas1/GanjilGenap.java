package Tugas1;

import java.util.Scanner;

public class GanjilGenap extends Thread{
	public static int input = 0 ;
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan angka");
		input = scan.nextInt(); scan.nextLine();
		if (input % 2 == 0) {
			System.out.println("angka genap");
		}else {
			System.out.println("angka ganjil");
		}
	}
}

