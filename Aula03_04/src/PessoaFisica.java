public class PessoaFisica {

    private String telefone;

    private String endereco;

    private String cpf;

    private String nome;

    public PessoaFisica(String nome, String cpf, String endereco, String telefone) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.nome = nome;

        if (isCpfValido(cpf)){
            this.cpf = cpf;
        }else {
            throw new RuntimeException("CPF INVALIDO");
        }
    }
    public java.lang.String getTelefone() {
        return telefone;
    }

    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }

    public java.lang.String getEndereco() {
        return endereco;
    }

    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public java.lang.String getNome() {
        return nome;
    }

    private boolean isCpfValido(String cpf){
// Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11)
            return false;
        // Verifica se todos os dígitos são iguais
        boolean todosDigitosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }if (todosDigitosIguais)
            return false;

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * (cpf.charAt(i) - '0');
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9)
            primeiroDigito = 0;

        // Verifica o primeiro dígito verificador
        if (primeiroDigito != cpf.charAt(9) - '0')
            return false;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (11 - i) * (cpf.charAt(i) - '0');
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9)
            segundoDigito = 0;

        // Verifica o segundo dígito verificador
        if (segundoDigito != cpf.charAt(10) - '0')
            return false;

        // CPF válido
        return true;

    }

}
