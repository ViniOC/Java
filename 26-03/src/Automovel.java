package src;


public class Automovel {

    private int quantidadeRodas;

    private String cor;

    private String modelo;

    private String marca;

    private int anoFabricacao;

    public String proprietario;

    public Automovel(int quantidadeRodas, String cor, String modelo, String marca, int anoFabricacao, String proprietario) {
        this.quantidadeRodas = quantidadeRodas;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.proprietario = proprietario;
    }


    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getProprietario() {
        return proprietario;
    }

}








