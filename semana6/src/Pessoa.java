public class Pessoa {

    private Telefone comercial;

    private Telefone telefoneFixo;

    private Telefone celular;

    private Endereco endereco;

    private String nome;

    public Pessoa(String nome, Telefone celular) {
        this.celular = celular;
        this.nome = nome;
    }

    public Telefone getComercial() {
        return comercial;
    }

    public void setComercial(Telefone comercial) {
        this.comercial = comercial;
    }

    public Telefone getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(Telefone telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public Telefone getCelular() {
        return celular;
    }

    public void setCelular(Telefone celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
