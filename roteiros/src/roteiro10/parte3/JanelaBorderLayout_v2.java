package roteiro10.parte3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class JanelaBorderLayout_v2 extends JFrame
{


    public JanelaBorderLayout_v2()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        this.setLayout(new BorderLayout());
        this.inicializarComponentes();
        this.pack();
        this.setVisible(true);
    }

    public void inicializarComponentes()
    {
        /* Instanciando paineis */
        this.pnCabecalho = new JPanel();
        this.pnRodape = new JPanel();
        this.pnEsquerda = new JPanel();
        this.pnDireita = new JPanel();
        this.pnCentro = new JPanel();

        /* Setando as cores dos paineis */
        /* Normalmente não é possível enxergar os JPanel, por isso colocamos cores para facilitar */
        this.pnCabecalho.setBackground(Color.red);
        this.pnRodape.setBackground(Color.blue);
        this.pnDireita.setBackground(Color.gray);
        this.pnEsquerda.setBackground(Color.yellow);
        this.pnCentro.setBackground(Color.green);

        /* Adicionando os paineis à janela, em sua respectiva área */
        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro,BorderLayout.CENTER); 

        /* Inicializando  paineis*/
        this.inicializarCentro();
        this.inicializarRodape();
        this.iniciarlizarCabecalho();
    }

    /* Funções que alteram o layout dos paineis de cada área */
    public void iniciarlizarCabecalho()
    {
        this.pnCabecalho.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.pnCabecalho.add(new JLabel("Curso"));
        this.pnCabecalho.add(new JTextField(10));
        this.pnCabecalho.add(new JLabel("Observações"));
        this.pnCabecalho.add(new JTextField(25));
    }

    public void inicializarRodape()
    {
        this.pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.pnRodape.add(new JButton("Botão 04"));
        this.pnRodape.add(new JButton("Botão 05"));
    }

    public void inicializarCentro()
    {
        this.pnCentro.setLayout(new GridLayout(3,2));
        this.pnCentro.add(new JLabel("Matricula"));
        this.pnCentro.add(new JTextField());
        this.pnCentro.add(new JLabel("Nome"));
        this.pnCentro.add(new JTextField());
        this.pnCentro.add(new JLabel("Idade"));
        this.pnCentro.add(new JTextField());

    }

    /* Dividindo as áreas em paineis com o JPanel */
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;


}
