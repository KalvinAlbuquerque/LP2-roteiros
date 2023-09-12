package roteiro9.parte1;


/* Resposta questão 6:
 * Sim, quando uma classe está implementando os métodos de uma interface, estamos fazendo uso da técnica de polimorfismo,
 * uma vez que, segundo a definição dada pelo roteiro "Habilidade de objetos de classes diferentes responderem a mesma mensagem de diferentes maneiras",
 * temos objetos de classes diferentes, com métodos "iguais", respondendo de forma diferente, uma vez que a implementação de cada método
 * é distinto para cada classe
 */
public class Principal
{
    public static void main(String args[])
    {
        Quadrado quadrado = new Quadrado(10);
        Retangulo retangulo = new Retangulo(10, 10);

        quadrado.printarInformacoes();
        System.out.println("");
        retangulo.printarInformacoes();

    }
}
