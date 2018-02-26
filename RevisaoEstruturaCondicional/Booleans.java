package RevisaoEstruturaCondicional;

public class Booleans {
	public static void main(String args[]){
		boolean valor1=25<30, valor2=25==30;
		
		System.out.println("Resultado 1   "+valor1);
		System.out.println("Resultado 2:  "+valor2);
		System.out.println("Resultado 3:  "+ (!valor1));
		System.out.println("Resultado 4:  "+ (valor1&&valor2));
		System.out.println("Resultado 5:  "+ (valor1||valor2));
		System.out.println("Resultado 6:  "+ (!(valor1&&(!valor2))));
	}

}
