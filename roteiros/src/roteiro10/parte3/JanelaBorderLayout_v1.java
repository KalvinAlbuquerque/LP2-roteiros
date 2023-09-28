package roteiro10.parte3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class JanelaBorderLayout_v1 extends JFrame
{


    public JanelaBorderLayout_v1()
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
    }

    /* Dividindo as áreas em paineis com o JPanel */
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;


}
