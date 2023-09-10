package roteiro8.parte1;

public class Cliente
{

    /* Builders */
    Cliente(){};    

    public Cliente(String cpf_cnpj, String nome, String endereço, String email, String telefone) 
    {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        this.telefone = telefone;
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
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
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



    /* ATTRIBUTES */
    private String cpf_cnpj;
    private String nome;
    private String endereço;
    private String email;
    private String telefone;
}
