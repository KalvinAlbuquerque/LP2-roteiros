package roteiro7.parte1;

import java.util.Scanner;

public class Aluno 
{
    Aluno(int matricula, String nome, String curso, int anoIngresso, int qtdeDisciplinas)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.qtdeDisciplinas = qtdeDisciplinas;
    
        /* Verificando se o aluno possui pelo menos uma disciplina para que sua situação seja "Matriculado" */
        if(qtdeDisciplinas > 0)
        {
            situacao = "Matriculado";
        }
        else
        {
            situacao = "Não matriculado";
        }
    }
    
    Aluno(){};
    
    public static Aluno instanciandoNovoAluno()
    {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(entrada.nextLine());
        
        System.out.println("Digite o curso do aluno:");
        aluno.setCurso(entrada.nextLine());

        System.out.println("Digite a matricula do aluno: ");
        aluno.setMatricula(entrada.nextInt());

        System.out.println("Digite o ano de ingresso do aluno: ");
        aluno.setAnoIngresso(entrada.nextInt());

        aluno.setQtdeDisciplinas(0);

        entrada.close();

        return aluno;

    }

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

    public int getQtdeDisciplinas()
    {
        return this.qtdeDisciplinas;
    }
    public void setQtdeDisciplinas(int qtdeDisciplinas)
    {
        this.qtdeDisciplinas = qtdeDisciplinas;

        /* Caso a quantidade de disciplinas seja igual a zero, a situação do aluno muda automaticamente 
        * para "Não Matriculado" 
        */
        if(qtdeDisciplinas == 0)
        {
            this.situacao = "Não matriculado";
        }
        else
        {
            this.situacao = "Matriculado";
        }
    }

    /* Criei apenas o método get para a situação, pois não é necessário que o usuário mude na "mão" a situaçaõ do aluno,
     * o programa deve se encarregar de fazer essa alteração de acordo com a quantidade de disciplinas do aluno.
     */
    public String getSituacao()
    {
        return this.situacao;
    }

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;    


}
