package RevisaoEstruturaCondicional;

import javax.swing.JOptionPane;

public class Igualdade {
   public static void main (String args[]){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

      if (n1 == n2)
          JOptionPane.showMessageDialog(null,"Os dois números são iguais");
      else
         JOptionPane.showMessageDialog(null,"Os dois números são diferentes");
   }
}
