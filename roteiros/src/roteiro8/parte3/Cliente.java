package roteiro8.parte3;

public class Cliente
{

    /* Builders */
    Cliente(){};    

    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone, Veiculo veiculo) 
    {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }
    
    /* GENERAL FUNCTIONS */
    public void printandoInformacoes()
    {
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("CPF/CNPJ do cliente: " + this.getCpf_cnpj());
        System.out.println("endereco do cliente: " + this.getEndereco());
        System.out.println("E-mail do cliente: " + this.getEmail());
        System.out.println("Telefone do cliente: " + this.getTelefone());
        System.out.println("Pedágio do cliente: " + this.getVeiculo().calculoPedagio());
        System.out.println("");
    }


    /* GETTERS AND SETTERS */
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


    /* ATTRIBUTES */
    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private Veiculo veiculo;
}
