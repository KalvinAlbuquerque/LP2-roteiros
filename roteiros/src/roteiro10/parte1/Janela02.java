package roteiro10.parte1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela02 extends JFrame
{
    private int altura = 300;
    private int largura = 300;
    private JButton button01;
    private JButton button02;

    public Janela02()
    {
        /* Habilita o botão de "xis" para fechar a janela e encerra o progrma ao fechar a janela */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Seta a altura e largura da tela */
        this.setSize(this.largura, this.altura);

        /* Torna a janela visível */
        this.setVisible(true);

        /* Mudando o nome da janela */
        this.setTitle("Janela02");

        /* Setando o layout da janela */
        this.setLayout(null);

        /* Instanciando botões */
        this.button01 = new JButton("Botão 01");
        this.button02 = new JButton("Botão 02");

        /* Setando as dimensões dos botões  */
        /* setBounds(posição x, posição y, largura, altura) */
        this.button01.setBounds(20, 50,100, 40);
        this.button02.setBounds(130, 50,100, 40);

        /* Adicionando butões à tela */
        this.add(this.button01);
        this.add(this.button02);

    }
    
}
