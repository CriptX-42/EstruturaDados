package RevisaoEstruturaCondicional;

import javax.swing.JOptionPane;

public class TipoNum {

	public static void main(String[] args) {
		double num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
		if(num == 0) {
			JOptionPane.showMessageDialog(null, "O numero é 0");
		}else if(num < 0) {
			JOptionPane.showMessageDialog(null, "O numero é negativo");
		}else if(num > 0) {
			JOptionPane.showMessageDialog(null, "O numero é positivo");
		}
	}

}
