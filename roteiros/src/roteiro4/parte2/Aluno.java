package roteiro4.parte2;


/* 
    * O construtor é um método que permite construir um objeto da forma que você desejar.
    * Pode-se criar vários construtores, como ele é uma função, podemos usar a sobrecarga 
    * para criar vários construtores diferentes, todos eles irão criar um objeto seguindo 
    * sua implementação.
    * O construtor deve ter o MESMO nome da classe, igualzinho.
*/
public class Aluno 
{
    public int matricula;
    public String nome;
    public String curso;
    public int anoIngresso;    

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso)
    {
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }
}
