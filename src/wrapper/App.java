package wrapper;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		
		ConverterVariavel var = new ConverterVariavel();
		var.setNum1(num);
		System.out.println(var.conversao());
	}

}
