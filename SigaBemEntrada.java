package br.com.abc.Projeto;

public class SigaBemEntrada {
    private double peso;
    private String DDD;
    private String estado;
    private String nomeDestinatario;

    public SigaBemEntrada() {
    }

    public SigaBemEntrada(double peso, String DDD, String estado, String nomeDestinatario) {
        this.peso = peso;
        this.DDD = DDD;
        this.estado = estado;
        this.nomeDestinatario = nomeDestinatario;
    }

    @Override
    public String toString() {
        return "SigaBemEntrada{" +
                "peso=" + peso +
                ", cepOrigem=" + DDD +
                ", cepDestino=" + estado +
                ", nomeDestinatario='" + nomeDestinatario + '\'' +
                '}';
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

}
