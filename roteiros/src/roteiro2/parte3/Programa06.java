package roteiro2.parte3;

import javax.swing.JOptionPane;

public class Programa06
{
    public static void main(String[] args)
    {
        /* Definindo flag para sinaliazr que o usuário deseja dar input 
         * em mais dados
         */
        int flag = 0;

        do
        {
            /* Perguntando se o usuário deseja informar uma nota.
             * Para isso, estou utilizando o método showConfirmDialog da biblioteca gráfica 
             * levantada nos roteiros anteriormente. Esse método irá gerar uma janela com "Yes" e "No".
             * O retorno será 1 ou 0 que irá indicar se o usuário deseja continuar informando notas ou não.
             */
            flag = JOptionPane.showConfirmDialog(null, "Deseja informar uma nota?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            /*Irei acessar a constante YES_OPTION e NO_OPTION, ao invés de flag == 1 ou flag == 0 apenas por estética,
            */
            if(flag == JOptionPane.YES_OPTION)
            {
                String entrada = JOptionPane.showInputDialog("Informe a nota: ");
                int nota = Integer.parseInt(entrada);
                
                if(nota >= 7)
                {
                    JOptionPane.showMessageDialog(null, "A nota informada foi: " + nota + "\nAprovado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "A nota informada foi: " + nota + "\nReprovado");
                }
            }
            else if(flag == JOptionPane.NO_OPTION)
            {
                break;
            }

        }while(flag == 0);
    
        JOptionPane.showMessageDialog(null," O programa será finalizado =)");
    }
}
