package wrapper;

import java.util.Scanner;//Importação da classe Scanner para a leitura de entradas do teclado 

public class App { 

	public static void main(String[] args) {		
		//Instanciamento de um objeto da classe Scanner para fazer leitura de entrada de dados
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número inteiro: ");
		//método responsável para ler e armazenar o número dado pelo usúario
		num = ler.nextInt();
		
		//Instanciamento do objeto da classe responsável pelo casting
		ConverterVariavel var = new ConverterVariavel();
		var.setNum1(num);
		System.out.println(var.conversao());
	}

}
