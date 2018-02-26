package RevisaoAritimetica;

import javax.swing.JOptionPane;

public class Circunferencia {

	public static void main(String[] args) {
		int Raio = 0, Area = 0, Perimetro = 0;
		double PI = 3.14;

		Raio = Integer.parseInt(JOptionPane.showInputDialog("Coloque o raio da circunferência: "));
		

		Area = (int) (PI * Raio);
		Perimetro = (int) (2 * PI * Raio);
		
		JOptionPane.showMessageDialog(null, "A Área é de : " + Area + " O perimetro é de: " + Perimetro);

	}

}
