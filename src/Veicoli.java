public class Veicoli {
    private String marca;
    private String modello;
    private String numeroDiTarga;
    private double tariffaGiornaliera;

    public Veicoli(String marca, String modello, String numeroDiTarga, double tariffaGiornaliera) {
        this.marca = marca;
        this.modello = modello;
        this.numeroDiTarga = numeroDiTarga;
        this.tariffaGiornaliera = tariffaGiornaliera;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getNumeroDiTarga() {
        return numeroDiTarga;
    }

    public void setNumeroDiTarga(String numeroDiTarga) {
        this.numeroDiTarga = numeroDiTarga;
    }

    public double getTariffaGiornaliera() {
        return tariffaGiornaliera;
    }

    public void setTariffaGiornaliera(double tariffaGiornaliera) {
        this.tariffaGiornaliera = tariffaGiornaliera;
    }

    @Override
    public String toString() {
        return "Veicoli{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numeroDiTarga='" + numeroDiTarga + '\'' +
                ", tariffaGiornaliera=" + tariffaGiornaliera +
                '}';
    }
}
