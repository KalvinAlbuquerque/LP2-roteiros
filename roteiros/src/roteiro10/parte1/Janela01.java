package roteiro10.parte1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela01 extends JFrame
{
    private int altura = 600;
    private int largura = 500;
    private JButton button01;
    private JButton button02;

    public Janela01()
    {
        /* Habilita o botão de "xis" para fechar a janela e encerra o progrma ao fechar a janela */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Seta a altura e largura da tela */
        this.setSize(this.largura, this.altura);

        /* Torna a janela visível */
        this.setVisible(true);

        /* Mudando o nome da janela */
        this.setTitle("Janela01");

        /* Setando o layout da janela */
        /* Uma vez que estamos setando o layout para null, quer dizer que temos que inserir
         * manualmente as posições e dimensões dos botões
         * 
         * Se eu comentar essa linha, ou seja, se eu não chamar essa função, a própria biblioteca,
         * irá ajustar as dimensões e o posicionamento dos botões. O que será um desastre.
         */
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
