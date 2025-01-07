package wrapper;

public class ConverterVariavel {
	
	private int num1;
	
	//Início dos métodos get and set 
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	//Fim dos métodos get and set 
	
	//Método responsável pelo casting da variavel 
	public long conversao() {
		num1 = getNum1();
		long num2 = num1;
		
		return num2;
	}
}
