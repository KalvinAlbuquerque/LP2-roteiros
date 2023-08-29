package roteiro3.parte1;

import java.util.Scanner;
/* Funções/métodos estáticos, no Java, são funções que pertencem à própria classe e não a uma instância da classe
 * Desta forma, eu posso chamá-la de dentro da classe, sem precisar acessar por um objeto.
 * É tipo dar um this-> no C++.
 * As funções estáticas seguem o mesma sintaxe do C++ -> modificador + tipo de retorno + nome + ()
 * 
 * Em java há o static e o public: 
 * 
 * O static permite definir uma *variável* ou *método* como pertencente à classe ao 
 * invés de uma instância(objeto) dessa classe
 * 
 * O public, permite que o método seja acessado por qualquer classe, em qualquer pacote. 
 * Embora não foi dito ainda no roteiro, temos o private e o protected, que apenas impossibilitam o acesso/visibilade
 * de métodos e atributos para quem não for da mesma classe.
 * 
 * Eu posso criar uma função estática pública ou privada, ou default - caso eu não especificar public ou private, nesse caso
 * ele só poder ser acessada por classes do mesmo pacote. 
 * 
 * Note que o modificador "static" apenas possibilita que quem tiver acesso àquela classe pode chamar métodos ou atributos
 * sem a necessidade de criar um objeto. Apenas chamando a classe eu já tenho acesso. Obviamente isso depende da visibilidade
 * que foi permitida (public, private, protected, default)
*/

public class Programa10 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double sb, grat, imp, sr;

        System.out.println("Informe o salário base: ");
        sb = entrada.nextDouble();
        grat = sb * 5/100;
        imp = sb * 7/100;
        sr = (sb + grat) - imp;

        System.out.println("Salário a receber: " + sr);

        entrada.close();
    } 
    

}
