package roteiro5.parte1;

public class Principal
{
    public static void main(String[] args)
    {
        Loja loja01 = new Loja("Cleiton", "", "100", "Kalvin",10,10);
        Loja loja02 = new Loja("Acso", "ACSO LTDA", "1001", "Cleiton Rasta", 200, 200);

        loja01.printarInformacoes(loja01);
        loja02.printarInformacoes(loja02);
    }   
}
