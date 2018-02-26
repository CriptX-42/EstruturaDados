package RevisaoAritimetica;

import javax.swing.JOptionPane;

public class retangulo {

	public static void main(String[] args) {
		int Altura = 0, Largura = 0, Area = 0, Perimetro = 0;
		
		Altura = Integer.parseInt(JOptionPane.showInputDialog("Coloque a Altura do retangulo: "));
		Largura = Integer.parseInt(JOptionPane.showInputDialog("Coloque a Largura do retangulo: "));
		 
		 Area = Altura * Largura;
		 Perimetro = Largura * 2 + Altura + 2;
		 
		 
		 JOptionPane.showMessageDialog(null,"A Área é de : " + Area + " O perimetro é de: "+Perimetro);

	}

}
