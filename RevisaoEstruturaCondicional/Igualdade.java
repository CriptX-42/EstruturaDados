package RevisaoEstruturaCondicional;

import javax.swing.JOptionPane;

public class Igualdade {
   public static void main (String args[]){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));

      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro"));

      if (n1 == n2)
          JOptionPane.showMessageDialog(null,"Os dois n�meros s�o iguais");
      else
         JOptionPane.showMessageDialog(null,"Os dois n�meros s�o diferentes");
   }
}
