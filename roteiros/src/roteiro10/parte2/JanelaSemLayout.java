package roteiro10.parte2;

import javax.swing.JButton;
import javax.swing.JFrame;

/* Esta janela está sendo setada na mão , ou seja, sem gerenciador de Layout. 
 * Portanto eu seto o layout pra null e todas as dimensões eu seto na mão.
 */
public class JanelaSemLayout extends JFrame
{

    public JanelaSemLayout()
    {
        /* Setando as dimensões da tela e o layout */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.largura, this.altura);
        this.setTitle("Janela Sem Layout");

        /* Setando layout para null */
        this.setLayout(null);

        /*Inicializando componentes*/
        this.inicializarComponentes();

        /* Tornando a janela visível */
        this.setVisible(true);

    }

    public void inicializarComponentes()
    {
        /* Instanciando os botões */
        this.button01 = new JButton("Botão 01");
        this.button02 = new JButton("Botão 02");
        this.button03 = new JButton("Botão 03");
        this.button04 = new JButton("Botão 04");
        this.button05 = new JButton("Botão 05");
        this.button06 = new JButton("Botão 06");

        /* Setando as dimensões e o posicionamento dos botões na tela */
        this.button01.setBounds(20, 50, 90, 30);
        this.button02.setBounds(130, 50, 90, 30);
        this.button03.setBounds(30, 90, 90, 30);
        this.button04.setBounds(140, 90, 90, 30);
        this.button05.setBounds(40, 130, 90, 30);
        this.button06.setBounds(150, 130, 90, 30);

        /* Adicionando botões à janela */
        this.add(this.button01);
        this.add(this.button02);
        this.add(this.button03);
        this.add(this.button04);
        this.add(this.button05);
        this.add(this.button06);
    }

    private int largura = 500;
    private int altura = 500;
    private JButton button01;
    private JButton button02;
    private JButton button03;
    private JButton button04;
    private JButton button05;
    private JButton button06;



}
