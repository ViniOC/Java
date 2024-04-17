public class ContaBancaria {

    private long saldo;

    private PessoaJuridica pessoaJuridica;

    private PessoaFisica pessoaFisica;

    private Integer digitoConta;

    private String contaBancaria;

    private String agencia;


    public ContaBancaria(String agencia, String contaBancaria, Integer digitoConta, PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
        this.digitoConta = digitoConta;
        this.contaBancaria = contaBancaria;
        this.agencia = agencia;
        this.saldo = 0L;
    }
    public void saque(Long valor){

    }

    public void deposito(Long valor){
        //codigo
    }

    private void validaValor (Long valor){

        //codigo
    }
    private void validaCriacaoconta (String agencia, String contaBancaria, Integer digitoConta, PessoaFisica pessoaFisica){


    }

}
