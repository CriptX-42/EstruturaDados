package RevisaoEstruturaCondicional;

import javax.swing.JOptionPane;

public class Texto {
	public static void main(String args[]) {
		String palavra1 = JOptionPane.showInputDialog("Digite uma palavra");
		String palavra2 = JOptionPane.showInputDialog("Digite outra palavra");
		if (palavra1.equals(palavra2))
			JOptionPane.showMessageDialog(null, "As duas palavras s�o iguais");
		else
			JOptionPane.showMessageDialog(null, "As duas palavras s�o diferentes");
	}
}
