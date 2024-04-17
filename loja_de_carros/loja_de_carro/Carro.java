package loja_de_carro;

import java.util.List;

public class Carro {

    //private package

    private int portas;

    private Cor cor;

    private int lugares;

    private String marca;

    private List<String>  adicionais;

    private int velocidade;

    //metodos get e set


    public int getPortas() {
        return portas;
    }


    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getLugares() {
        return lugares;
    }


    public String getMarca() {
        return marca;
    }


    public List<String> getAdicionais() {
        return adicionais;
    }

    public void addAdicionais(String adicional) {

        adicionais.add(adicional);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar (){
        velocidade++;
    }
    public void freiar (){
        if (velocidade >0){

        velocidade --;
        }
    }
}
