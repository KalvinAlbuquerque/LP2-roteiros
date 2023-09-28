package roteiro10.parte2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/* O BorderLayout é um gerenciador que permite organizar os componentes visuais em cinco áreas
 * diferentes: superior, inferior, esquerda,  direita e centro
 */
public class JanelaBorderLayout extends JFrame
{
    public JanelaBorderLayout()
    {
        /* Setando titulo e close da janela */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        /* Setando o layout automaticamente */
        this.setLayout(new BorderLayout());

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

        /* Adicionando botões à tela -> conforme as cinco áreas */
        this.add(this.button01, BorderLayout.PAGE_START);
        this.add(this.button02, BorderLayout.PAGE_END);
        this.add(this.button03, BorderLayout.LINE_START);
        this.add(this.button04, BorderLayout.LINE_END);
        this.add(this.button05, BorderLayout.CENTER);

    }
 
    private JButton button01;
    private JButton button02;
    private JButton button03;
    private JButton button04;
    private JButton button05;
}

    

