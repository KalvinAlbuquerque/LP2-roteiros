package roteiro4.parte3;

public class Principal 
{
    public static void main(String[] args)
    {


        Aluno aluno01 = new Aluno(111,"José", "Sistemas de Informação", 2019);

        System.out.println("Matricula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de ingresso: " + aluno01.getAnoIngresso());

        aluno01.setMatricula(222);

        System.out.println("\nMatricula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de ingresso: " + aluno01.getAnoIngresso());

    }    
}
