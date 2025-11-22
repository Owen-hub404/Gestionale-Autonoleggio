public class Autovetture extends Veicoli{
    private byte numeroDiPorte;
    private byte numeroDiPosti;

    public Autovetture() {
        super("", "", "", 0.0);
        this.numeroDiPorte = 0;
        this.numeroDiPosti = 0;
    }

    public Autovetture(String marca, String modello, String numeroDiTarga, double tariffaGiornalieraDiTarga, byte numeroDiPorte, byte numeroDiPosti) {
        super(marca, modello, numeroDiTarga, tariffaGiornalieraDiTarga);
        this.numeroDiPorte = numeroDiPorte;
        this.numeroDiPosti = numeroDiPosti;
    }

    public byte getNumeroDiPorte() {
        return numeroDiPorte;
    }

    public byte getNumeroDiPosti() {
        return numeroDiPosti;
    }

    public void setNumeroDiPorte(byte numeroDiPorte) {
        this.numeroDiPorte = numeroDiPorte;
    }

    public void setNumeroDiPosti(byte numeroDiPosti) {
        this.numeroDiPosti = numeroDiPosti;
    }

    @Override
    public String toString() {
        return  "TIPOLOGIA: Autovettura" + "\n" +
                super.toString() + "\n" +
                "Numero di porte: " + numeroDiPorte + "\n" +
                "Numero di posti: " + numeroDiPosti;
    }
}
