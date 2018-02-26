package RevisaoAritimetica;

import javax.swing.JOptionPane;

public class Sum {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, sum = 0;
		 num1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero"));
		 num2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero"));
		 
		 sum = num1 + num2;
		 
		 JOptionPane.showMessageDialog(null,"A soma é: " + sum);
	}

}
