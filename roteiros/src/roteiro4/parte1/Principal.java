package roteiro4.parte1;

public class Principal 
{
    public static void main(String[] args)
    {
        /* Em java, pelo visto, classes que estão no mesmo pacote são visíveis entre si.
         * Diferentemente do C++ , eu não preciso dar um include , nem o ifndef
         */

        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "José";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;

        Aluno aluno02 = new Aluno();
        aluno02.matricula = 100;
        aluno02.nome = "Toquinha";
        aluno02.curso = "Urbanismo";
        aluno02.anoIngresso = 2019;

        System.out.println("Matricula: " + aluno01.matricula);
        System.out.println("Nome: " + aluno01.nome);
        System.out.println("Curso: " + aluno01.curso);
        System.out.println("Ano de ingresso: " + aluno01.anoIngresso);

        System.out.println("\nMatricula: " + aluno02.matricula);
        System.out.println("Nome: " + aluno02.nome);
        System.out.println("Curso: " + aluno02.curso);
        System.out.println("Ano de ingresso: " + aluno02.anoIngresso);
    }    
}
