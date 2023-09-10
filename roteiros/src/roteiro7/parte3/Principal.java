package roteiro7.parte3;


public class Principal 
{

    public static void main(String[] args)
    {
        
        Aluno aluno01 = new Aluno(111,"Jose", "Sistemas de informação", 2019);

        /* Adicionando disciplinas */
        aluno01.adicionarDisciplina("LP2");
        aluno01.adicionarDisciplina("SO");
        aluno01.adicionarDisciplina("ED1");
        aluno01.adicionarDisciplina("BD1");


        /* Printando as informações do aluno */
        aluno01.printandoInformacoes();
    }   
}
