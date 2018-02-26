package RevisaoEstruturaCondicional;

import javax.swing.JOptionPane;

public class ImparPar {
	public static void main (String[]args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O numero é par");
		}else {
			JOptionPane.showMessageDialog(null, "O numero é impar");
		}
	}
}
