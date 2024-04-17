package loja_de_carro;
import java.util.Date;
public class pessoa {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String endereço;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public boolean isCPFVlid(String cpf){
        //implementar conforme receita federal
        //não pesquisar codigo pronto
        //validação matematica de como validar um cpf

        return true;
    }
}
