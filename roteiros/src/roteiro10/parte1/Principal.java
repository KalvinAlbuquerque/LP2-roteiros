package roteiro10.parte1;

/* UI -> segmento de código que permitem os meios de interação com usuário (I/O) 
 * Componentes gráficos -> janelas,botões, caixas de textos
 * Gestores de posicionamento -> "dimensionadores" dos componentes gráficos
 * Manipuladores de eventos -> respondem aos eventos que são causados pelo usuário
*/

/* Principais bibliotecas gráficas:
 * AWT -> gestão de posicionamento e manipulação de eventos
 * Swing -> trata dos componentes visuais em tela
 * Java 2D -> trata dos componentes gráficos 2D
 */


public class Principal
{
    public static void main(String args[])
    {
        /* Instanciando a janela */
        Janela01 janela01 = new Janela01();

        Janela02 janela02 = new Janela02();
    }
}
