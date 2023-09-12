package roteiro9.parte2;

/* Interface - "contrato"
 * Similar ao "virtual" em C++ -> obriga que as classes filhas implementem as funções.
 * Dentro da interface, teremos somente os protótipos das funções(basicamente é um header) e as classes filhas vão
 * implementar esses métodos.
 * 
 * Sintaxe da interface: no lugar de Public Class -> Public interface
 * 
 * Na interface, temos que inicializar um atributo quando queremos tê-lo. Então , você não pode fazer public String teste;
 * Mas sim, será public String teste = null; Caso contrário o compilador reclama.
 * 
 * Para fazer uma classe herdar da interface - assumir o "contrato" - uso a sintaxe "implements"
 * Exemplo: public class Quadrado implements FiguraGeometrica 
 */
public interface FiguraGeometrica
{
    public String getNomeFigura();
    public double getArea();
    public double getPerimetro();
    public void printarInformacoes();
}
