package RevisaoEstruturaCondicional;

import javax.swing.JOptionPane;

public class TipoNum {

	public static void main(String[] args) {
		double num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero: "));
		if(num == 0) {
			JOptionPane.showMessageDialog(null, "O numero � 0");
		}else if(num < 0) {
			JOptionPane.showMessageDialog(null, "O numero � negativo");
		}else if(num > 0) {
			JOptionPane.showMessageDialog(null, "O numero � positivo");
		}
	}

}
