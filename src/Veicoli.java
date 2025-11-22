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

    public String getModello() {
        return modello;
    }

    public String getNumeroDiTarga() {
        return numeroDiTarga;
    }

    public double getTariffaGiornaliera() {
        return tariffaGiornaliera;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setNumeroDiTarga(String numeroDiTarga) {
        this.numeroDiTarga = numeroDiTarga;
    }

    public void setTariffaGiornaliera(double tariffaGiornalieraDiTarga) {
        this.tariffaGiornaliera = tariffaGiornalieraDiTarga;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Modello: " + modello + "\n" +
                "Numero di targa: " + numeroDiTarga + "\n" +
                "Tariffa giornaliera: " + tariffaGiornaliera + "€";
    }
}
