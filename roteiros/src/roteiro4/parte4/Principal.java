package roteiro4.parte4;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        /* Solicitando input de dados */
        
        System.out.println("Informe o curso do aluno: ");
        /* NextLine -> utilizado quando houver várias palavras, logo , haverá espaços entre elas */
        String curso = entrada.nextLine();

        System.out.println("Informe o nome do aluno: ");
        /* Next -> utilizado para quando houver uma palavra só, sem espaços */
        String nome = entrada.next();

        
        System.out.println("Informe a matricula do aluno: ");
        int matricula = entrada.nextInt();


        System.out.println("Informe o ano de ingresso do aluno: ");
        int anoIngresso = entrada.nextInt();

        System.out.println("Informe a quantidade de disciplinas do aluno: ");
        int qtdeDisciplinas = entrada.nextInt();

        /* Instanciando objeto com os inputs obtidos */
        Aluno aluno01 = new Aluno(matricula,nome,curso,anoIngresso,qtdeDisciplinas);

        /* Printando informações do aluno */
        System.out.println("\nMatricula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de ingresso: " + aluno01.getAnoIngresso());
        System.out.println("Quantidade de disciplinas: " + aluno01.getQtdeDisciplinas());
        System.out.println("Situação do aluno: " + aluno01.getSituacao());

        entrada.close();

    }    
}
