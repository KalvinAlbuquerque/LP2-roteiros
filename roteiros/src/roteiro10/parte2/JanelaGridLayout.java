package roteiro10.parte2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/* O gridLayout é um gerenciador de Layout que dispõe os componentes visuais em um certo numero
 * de linhas ou colunas formando uma grade com componentes de igual proporção
 */
public class JanelaGridLayout extends JFrame
{
 
    public JanelaGridLayout()
    {
        /* Setando titulo e close da janela */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela GridLayout");

        /* Setando o layout automaticamente */
        /* Duas linhas e 3 colunas */
        this.setLayout(new GridLayout(2,3));

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

