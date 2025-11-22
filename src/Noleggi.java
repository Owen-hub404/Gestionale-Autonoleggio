import java.time.LocalDate;

public class Noleggi{
    private LocalDate dataDiInizio;
    private LocalDate dataDiFine;
    private Veicoli veicolo;
    private Clienti cliente;
    private int importoTotale;


    public Noleggi(){
        this.dataDiInizio = LocalDate.now();
        this.dataDiFine = null;
        this.veicolo = null;
        this.cliente = null;
        this.importoTotale = 0;
    }

    public Noleggi(LocalDate dataDiInizio, LocalDate dataDiFine,
                   Veicoli veicolo, Clienti cliente, int importoTotale) {
        this.dataDiInizio = LocalDate.now();
        this.dataDiFine = dataDiFine;
        this.veicolo = veicolo;
        this.cliente = cliente;
        this.importoTotale = importoTotale;
    }

    public LocalDate getDataDiInizio() {
        return dataDiInizio;
    }

    public LocalDate getDataDiFine() {
        return dataDiFine;
    }

    public Veicoli getVeicolo() {
        return veicolo;
    }

    public Clienti getCliente() {
        return cliente;
    }

    public int getImportoTotale() {
        return importoTotale;
    }

    public void setDataDiFine(LocalDate dataDiFine) {
        this.dataDiFine = dataDiFine;
    }

    public void setVeicolo(Veicoli veicolo) {
        this.veicolo = veicolo;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }

    public void setImportoTotale(int importoTotale) {
        this.importoTotale = importoTotale;
    }

    @Override
    public String toString() {
        return "DATA INIZIO NOLEGGIO: " + dataDiInizio +  "\n" +
                "DATA FINE NOLEGGIO: " + dataDiFine +  "\n" +
                "TOTALE NOLEGGIO: " + importoTotale +  "€";
    }
}
