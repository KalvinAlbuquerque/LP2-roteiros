package roteiro10.parte2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/* Esta janela vai ter o layout dimensionado automaticamente. Não vou setar na mão  */
/* O método responsável por setar o layout é o this.pack()*/
/* O FlowLayout é um gerenciador de Layouts que dispõe os componentes visuais em uma única linha,
 *  inicialiazando uma nova linha se o container não for suficientemente largo.
 */
public class JanelaFlowLayout extends JFrame
{
    public JanelaFlowLayout()
    {
        /* Setando titulo e close da janela */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela FlowLayout");

        /* Setando o layout automaticamente */
        this.setLayout(new FlowLayout());

        /* Inicializando os componentes */
        this.inicializarComponentes();

        /* Setando layout automaticamente */
        this.pack();

        /* Setando visibilidade da janela */
        this.setVisible(true);
    }
    
    public void inicializarComponentes()
    {
        /* Instanciando botões */
        this.button01 = new JButton("Botão 01");
        this.button02 = new JButton("Butão 02");
        this.button03 = new JButton("Botão 03");
        this.button04 = new JButton("Botão 04");
        this.button05 = new JButton("Botão 05");
        this.button06 = new JButton("Botão 06");

        /* Adicionando botões à tela */
        this.add(this.button01);
        this.add(this.button02);
        this.add(this.button03);
        this.add(this.button04);
        this.add(this.button05);
        this.add(this.button06);

    }
    private JButton button01;
    private JButton button02;
    private JButton button03;
    private JButton button04;
    private JButton button05;
    private JButton button06;
}
