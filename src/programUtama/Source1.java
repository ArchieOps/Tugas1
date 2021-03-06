package programUtama;

import java.util.Scanner;

import domain.Calculator;

public class Source1 {

	public static void main(String[] args) {
		System.out.println("Program Kalkulator Sederhana\n\n");
		System.out.print("Ada berapa pengoperasian? : ");
		
		Scanner scanTerm = new Scanner(System.in);
		
		int counter = scanTerm.nextInt();
		
		double a, b, result = 0;
		char operand;
		
		if(counter > 0) {
			do {
				System.out.print("Masukkan nilai pertama : ");
				a = scanTerm.nextDouble();
				System.out.print("Masukkan nilai kedua : ");
				b = scanTerm.nextDouble();
				System.out.print("Masukkan operasi dua bilangan (+, -, *, /) : ");
				operand = scanTerm.next().charAt(0);
				
				switch (operand){
					case '+' :
						result = Calculator.add(a, b);
						break;
					case '-' :
						result = Calculator.substract(a, b);
						break;
					case '*' :
						result = Calculator.multiply(a, b);
						break;
					case '/' :
						result = Calculator.division(a, b);
						break;
				}
				
				
				if( (int)result == result ) {
					System.out.println("Hasil perhitungannya adalah : " + (int) result);
				}
				else {
					System.out.println("Hasil perhitungannya adalah : " + result);
				}
						
				counter--;	
			}while(counter != 0);
			System.out.println("Terima kasih telah menggunakan program");
		}
		
		else {
			System.out.println("Terima kasih telah menggunakan program. Lain kali pastikan masukkan input yang benar");
		}
		
		scanTerm.close();
	}
}
