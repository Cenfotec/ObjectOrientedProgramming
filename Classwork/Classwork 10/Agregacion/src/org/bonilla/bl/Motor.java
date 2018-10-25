package org.bonilla.bl;

public class Motor {
    private String serie;
    private int numCilindros;

    public Motor(String serie, int numCilindros) {
        this.serie = serie;
        this.numCilindros = numCilindros;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    @Override
    public String toString() {
        return "\n| Serie: " + serie +
               "\n| Número de cilindros: " + numCilindros;
    }
}
