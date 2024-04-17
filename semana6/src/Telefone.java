public class Telefone {

    private String numnero;

    private String ddd;

    public Telefone(String ddd, String numnero) {
        this.numnero = numnero;
        this.ddd = ddd;
    }

    public String getNumnero() {
        return numnero;
    }

    public void setNumnero(String numnero) {
        this.numnero = numnero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}


