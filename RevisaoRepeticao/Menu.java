package RevisaoRepeticao;

import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {
		int opc = 0, num = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 -  N�meros de 1 a 100 \n"
					+ "2 -  N�meros de 100 a 1 \n" + "3 -  Intervalo crescente definido pelo usu�rio \n"
					+ "4 -  Intervalo decrescente definido pelo usu�rio \n"
					+ "5 -  N�meros m�ltiplos de 3 (intervalo de 3 at� 99) \n"
					+ "6 -  N�meros m�ltiplos de N (definido pelo usu�rio, no intervalo de N at� Nx100) \n"
					+ "7 -  Sequencia de Fibonacci (10 primeiros termos) \n"
					+ "8 -  Sequencia de Fibonacci (N primeiros termos, com N definido pelo usu�rio) \n"
					+ "9 -  Sair \n" + "-----------------------------------------------"));

			switch (opc) {
			case 1:
				while (num < 100) {
					num++;
					System.out.println(num);
				}
				num = 0;
				break;
			case 2:
				num = 100;
				while (num > 0) {
					num--;
					System.out.println(num);
				}
				num = 0;
				break;
			case 3:
				int crescente = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
				num = crescente;
				while (crescente < 100) {
					crescente += num;
					System.out.println(crescente);
				}
				System.out.println("");
				System.out.println("");
				System.out.println("");
				num = 0;
				break;
			case 4:
				int decrescente = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
				num = 100;
				while (num > 0) {
					num = num - decrescente;
					System.out.println(num);
				}
				System.out.println("");
				System.out.println("");
				System.out.println("");
				num = 0;
				break;

			case 5:
				num = 0;
				int aux = 0;
				while (num != 99) {
					num ++;
					aux = num;
					aux = aux * 3;
					System.out.println(aux);
					aux = num;
				}
				num = 0;
				break;
			case 6:
				num = 0;
				aux = 0;
				int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
				while (num < 100) {
					num ++;
					aux = num;
					aux = aux * tabuada;
					System.out.println(aux);
					aux = num;
				}
				num = 0;
				break;
			case 7:
				int a = 1;
				int b = 0;
				aux = 0;
				for(int i = 0; i < 30; i ++) {
					System.out.println(a);
					aux = a;
					a = a + b;
					b = aux;
				}
			break;
			case 8:
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
				 b = 0;
				aux = 0;
				for(int i = 0; i < 30; i ++) {
					System.out.println(a);
					aux = a;
					a = a + b;
					b = aux;
				}
			break;
			}
			
		}
}}
