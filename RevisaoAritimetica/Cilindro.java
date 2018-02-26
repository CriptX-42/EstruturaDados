package RevisaoAritimetica;

import javax.swing.JOptionPane;

public class Cilindro {

	public static void main(String[] args) {
		int Raio = 0, Volume= 0, Altura = 0;
		double PI = 3.14;

		Raio = Integer.parseInt(JOptionPane.showInputDialog("Coloque o raio da circunferência: "));
		Altura = Integer.parseInt(JOptionPane.showInputDialog("Coloque a altura do cilindro: "));

		Volume = (int) (Altura * PI * Raio);
		
		JOptionPane.showMessageDialog(null, "O volume é : " + Volume);
		

	}

}
