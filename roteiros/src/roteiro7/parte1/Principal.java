package roteiro7.parte1;

import java.util.Scanner;

public class Principal 
{

    /* Tipos de vetores em java:
     * estáticos: possuem tamanho fixo - sua memória é alocada em tempo de compilação
     * exemplo: int[] vetor1 = new int[10];
     * 
     * 
     * dinâmicos: não possuem tamanho fixo, podendo sempre alocar dinamicamente um novo espaço de memória. 
     * Sua memória é alocada em tempo de execução.
     * exemplo: arrayList - ArrayLists<String> listaNomes = new ArrayList<String>()
     * 
     * O ArrayList só armazena objetos, tipos primitivos não podem ser utilizados nessa estrutura
     * 
     */
    public static void main(String[] args)
    {
        
        /* Criando vetor estático de alunos
         * Óbvio dizer, mas ainda sempre bom dizer, apenas criei o vetor, ele está nulo. Preciso criar os objetos e 
         * preenchê-lo.
         */
        Aluno[] listaAlunos = new Aluno[3];

        /* Instanciando os objetos do tipo Aluno */
        //Aluno aluno01 = new Aluno(111,"Jose", "Sistemas de informação", 2019,0);
        //Aluno aluno02 = new Aluno(222, "Maria", "Enganharia Civil", 2020, 0);
        //Aluno aluno03 = new Aluno(333, "Carlos", "Quimica", 2021, 0);

        /* Solicitando input de dados ao usuário 
        * Problema no vetor estático: preciso que o usuário cadastre um número limitado de alunos, não pode ser dinamicamente.
        */
        Scanner entrada = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++)
        {
            listaAlunos[i] = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            listaAlunos[i].setNome(entrada.nextLine());

            System.out.println("Digite o curso do aluno: ");
            listaAlunos[i].setCurso(entrada.nextLine());

            System.out.println("Digite a matrícula do aluno: ");
            listaAlunos[i].setMatricula(entrada.nextInt());

            System.out.println("Digite o ano de ingresso do aluno: ");
            listaAlunos[i].setAnoIngresso(entrada.nextInt());

            listaAlunos[i].setQtdeDisciplinas(0);

            entrada.nextLine();
        }


        /* Armazenando os objetos no vetor de alunos - "na mão" */
        //listaAlunos[0] = aluno01;
        //listaAlunos[1] = aluno02;
        //listaAlunos[2] = aluno03;


        /* Printando informações dos alunos */
        System.out.println("\nPrintando as informações dos alunos: ");

        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println("\nMatricula: " + listaAlunos[i].getMatricula());
            System.out.println("Nome: " +  listaAlunos[i].getNome());
            System.out.println("Curso: " +  listaAlunos[i].getCurso());
            System.out.println("Ano de ingresso: " +  listaAlunos[i].getAnoIngresso());
            System.out.println("Quantidade de disciplinas: " +  listaAlunos[i].getQtdeDisciplinas());
            System.out.println("Situação do aluno: " +  listaAlunos[i].getSituacao());
        }

        entrada.close();

    }    
}
