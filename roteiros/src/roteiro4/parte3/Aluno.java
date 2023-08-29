package roteiro4.parte3;


/* 
 * Não é uma boa prática de programação permitir que os atributos de uma classe fiquem públicos - há exceções é claro.
 * Para que eu possa privatizar os atributos, eu preciso que outras classes, que terão acesso à minha classe em questão,
 * tenham acesso aos atributos dos objetos dessa classe. Para isso utilizamos o conceito de "encapsulamento" que é "solicitar",
 * digamos assim, à classe em questão para que ela possa permitir a alteração ou a obtenção de um atributo. 
 * Desta forma, utilizamos dois métodos que são universais quando falamos de Programação Orientada a Objetos, que são os getters e os setters,
 * os getters permitem que a classe externa possa obter o atributo daquele objeto, enquanto os setters permitem que os atributos
 * desses objetos sejam alterados.
 * 
 * Portanto, através do encapsulamento, mantemos nossos atributos ocultos e só os obtemos/modificamos através de métodos.
 * 
 * Em relação às boas práticas: sempre é get/set com a inicial minúscula e todas as outras palavras que a seguem, começam 
 * com a inicial maiúsculas
 * Bem como as classe possuem as iniciais maiúsculas
 * 
 * Uma boa prática de programação é colocar o this, até mesmo nos getters, quando estamos nos referindo aos atributos da classe.
 */
public class Aluno 
{

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;    
    

    public int getMatricula()
    {
        return this.matricula; 
    }
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }


    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCurso()
    {
        return this.curso;
    }
    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    public int getAnoIngresso()
    {
        return this.anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso)
    {
        this.anoIngresso = anoIngresso;
    }

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso)
    {
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }
}
