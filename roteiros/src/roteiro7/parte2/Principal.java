package roteiro7.parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal 
{

    /* ArrayList:
     * É um array dinâmico.
     * É uma classe, é necessário importá-la e instanciar um objeto para utilizar seus métodos.
     * 
     * Métodos:
     * add(elemento) - adiciona ao final do arraylist
     * add(int indice, elemento) - adiciona um elemento em alguma posíção do arraylist
     * get(int indice) - retorna o elemento de índice desejado 
     * remove(int indice)
     * size()
     * isEmpty()
    */
    public static void main(String[] args)
    {
        
        /* Criando arrayList */
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        /* Instanciando os objetos do tipo Aluno */
        Aluno aluno01 = new Aluno(111,"Jose", "Sistemas de informação", 2019,0);
        Aluno aluno02 = new Aluno(222, "Maria", "Enganharia Civil", 2020, 0);
        Aluno aluno03 = new Aluno(333, "Carlos", "Quimica", 2021, 0);

        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03);


        /* Printando informações dos alunos */
        System.out.println("\nPrintando as informações dos alunos: ");

        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println("\nMatricula: " + listaAlunos.get(i).getMatricula());
            System.out.println("Nome: " +  listaAlunos.get(i).getNome());
            System.out.println("Curso: " +  listaAlunos.get(i).getCurso());
            System.out.println("Ano de ingresso: " +  listaAlunos.get(i).getAnoIngresso());
            System.out.println("Quantidade de disciplinas: " +  listaAlunos.get(i).getQtdeDisciplinas());
            System.out.println("Situação do aluno: " +  listaAlunos.get(i).getSituacao());
        }

    }    
}
