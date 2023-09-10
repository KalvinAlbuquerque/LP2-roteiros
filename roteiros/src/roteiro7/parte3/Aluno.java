package roteiro7.parte3;

import java.util.ArrayList;

public class Aluno 
{
    Aluno(int matricula, String nome, String curso, int anoIngresso)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.listaDisciplinas = new ArrayList<String>();
    
    }

    
    Aluno(){};

    public void adicionarDisciplina(String nomeDaDisciplina)
    {
        this.listaDisciplinas.add(nomeDaDisciplina);
    }

    public void printandoInformacoes()
    {
        System.out.println("\nPrintando as informações dos alunos: ");


        System.out.println("\nMatricula: " + this.getMatricula());
        System.out.println("Nome: " +  this.getNome());
        System.out.println("Curso: " +  this.getCurso());
        System.out.println("Ano de ingresso: " +  this.getAnoIngresso());
        System.out.println("Situação do aluno: " +  this.getSituacao());
        System.out.println("Quantidade de disciplinas do aluno: " + this.getListaDisciplinas().size());

        for(int i = 0 ; i < this.getListaDisciplinas().size(); i++)
        {
            String disciplina = this.getListaDisciplinas().get(i);
            System.out.println("Disciplina " + i + ": " + disciplina);
        }
    }

    /* GETTERS AND SETTERS */
    public ArrayList<String> getListaDisciplinas() 
    {
        return this.listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<String> listaDisciplinas) 
    {
        this.listaDisciplinas = listaDisciplinas;
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

    public String getSituacao()
    {
        if(this.listaDisciplinas.size() == 0)
        {
            this.situacao = "Não Matriculado";
        }
        else
        {
            this.situacao = "Matriculado";
        }

        return this.situacao;
    }

    /* ATTRIBUTES */
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private String situacao;    
    private ArrayList<String> listaDisciplinas;


}
