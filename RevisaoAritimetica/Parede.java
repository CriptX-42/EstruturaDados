package RevisaoAritimetica;

import javax.swing.JOptionPane;

public class Parede {

	public static void main(String[] args) {
		// Implemente uma aplicação Java que recebe a largura de uma parede quadrada e a
		// largura de um azulejo quadrado, calcula e mostra quantos azulejos são
		// necessários para preencher completamente a parede.

		double AreaParede = 0, AlturaParede = 0, LarguraParede = 0;
		double AreaAzulejo = 0, AlturaAzulejo = 0, LarguraAzulejo = 0;
		
		double qtdAzulejo = 0;

		AlturaParede = Integer.parseInt(JOptionPane.showInputDialog("Coloque a Altura da parede: "));
		LarguraParede = Integer.parseInt(JOptionPane.showInputDialog("Coloque a Largura da parede: "));
		
		AlturaAzulejo = Integer.parseInt(JOptionPane.showInputDialog("Coloque a altura do Azulejo: "));
		LarguraAzulejo = Integer.parseInt(JOptionPane.showInputDialog("Coloque a largura do Azulejo: "));

		AreaParede = AlturaParede * LarguraParede;
		AreaAzulejo = AlturaAzulejo * LarguraAzulejo;
		
		qtdAzulejo = AreaParede/AreaAzulejo;

		JOptionPane.showMessageDialog(null, "Quantidade de azulejo: "+qtdAzulejo);

	}

}
