public class PessoaJuridica {
    private String telefone;

    private String endereco;

    private String cnpj;

    private String nomeFantasia;

    public PessoaJuridica(String nomeFantasia, String cnpj, String endereco, String telefone) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    private boolean isCnpjValido(String cnpj){


        // Remove caracteres não numéricos
        cnpj = cnpj.replaceAll("[^0-9]", "");

        // Verifica se o CNPJ tem 14 dígitos
        if (cnpj.length() != 14)
            return false;

        // Verifica se todos os dígitos são iguais
        boolean todosDigitosIguais = true;
        for (int i = 1; i < 14; i++) {
            if (cnpj.charAt(i) != cnpj.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais)
            return false;

        // Calcula o primeiro dígito verificador
        int soma = 0;
        int peso = 5;
        for (int i = 0; i < 12; i++) {
            soma += (cnpj.charAt(i) - '0') * peso;
            peso--;
            if (peso == 1)
                peso = 9;
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9)
            primeiroDigito = 0;

        // Verifica o primeiro dígito verificador
        if (primeiroDigito != cnpj.charAt(12) - '0')
            return false;

        // Calcula o segundo dígito verificador
        soma = 0;
        peso = 6;
        for (int i = 0; i < 13; i++) {
            soma += (cnpj.charAt(i) - '0') * peso;
            peso--;
            if (peso == 1)
                peso = 9;
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9)
            segundoDigito = 0;

        // Verifica o segundo dígito verificador
        if (segundoDigito != cnpj.charAt(13) - '0')
            return false;

        // CNPJ válido
        return true;
    }

}
