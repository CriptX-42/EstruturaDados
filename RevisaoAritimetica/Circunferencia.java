package RevisaoAritimetica;

import javax.swing.JOptionPane;

public class Circunferencia {

	public static void main(String[] args) {
		int Raio = 0, Area = 0, Perimetro = 0;
		double PI = 3.14;

		Raio = Integer.parseInt(JOptionPane.showInputDialog("Coloque o raio da circunfer�ncia: "));
		

		Area = (int) (PI * Raio);
		Perimetro = (int) (2 * PI * Raio);
		
		JOptionPane.showMessageDialog(null, "A �rea � de : " + Area + " O perimetro � de: " + Perimetro);

	}

}
