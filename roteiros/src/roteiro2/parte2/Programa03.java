package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa03 
{
    public static void main(String[] args)
    {
        System.out.println("Informe seu nome");
        String nome = JOptionPane.showInputDialog("Informe seu nome ");
        //System.out.println("Nome informado: " + nome);

        /* Usando interface Gráfica para printar */
        JOptionPane.showMessageDialog(null, "Nome informado: " + nome);

        String strIdade = JOptionPane.showInputDialog("Informe sua idade ");
        int idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog((null), "Idade informada: " + idade);

        //System.out.println("Idade informada: " + idade);

        /* Para dar input numa string utilizando o objeto JoptionPane para acessarmos o método
         * showInputDialog.
         * Para darmos input em um inteiro , usamos o objeto Integer para acessarmos o método
         * parseInt
         */
    }
    
}
