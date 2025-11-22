public class Furgoni extends Veicoli{
    private int portataInKg;
    private String dimensioni;

    public Furgoni(){
        super("", "", "", 0.0);
        this.portataInKg = 0;
        this.dimensioni = "";
    }

    public Furgoni(String marca, String modello, String numeroDiTarga, double tariffaGiornaliera, int portataInKg, String lunghezza, String larghezza, String altezza){
        super(marca, modello, numeroDiTarga, tariffaGiornaliera);
        this.portataInKg = portataInKg;
        setDimensioni(lunghezza, larghezza, altezza);
    }

    public void setPortataInKg(int portataInKg) {
        this.portataInKg = portataInKg;
    }

    public void setDimensioni(String lunghezza, String larghezza, String altezza) {
        this.dimensioni = lunghezza + "x" + larghezza + "x" + altezza;
    }

    public double getPortataInKg() {return portataInKg;}

    public String getDimensioni() {return dimensioni;}

    @Override
    public String toString() {
        return  "TIPOLOGIA: Furgone" + "\n" +
                super.toString() + "\n" +
                "Portata: " + portataInKg  + "Kg.\n" +
                "Dimensioni: [" + dimensioni + "]";
    }
}
