import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Noleggi{
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Veicoli veicolo;
    private Clienti cliente;
    private int importoTotale;


    public Noleggi(){
        this.dataInizio = LocalDate.now();
        this.dataFine = null;
        this.veicolo = null;
        this.cliente = null;
        this.importoTotale = 0;
    }

    public Noleggi(Veicoli veicolo, Clienti cliente, LocalDate dataFine) {
        this.dataInizio = LocalDate.now();
        this.veicolo = veicolo;
        this.cliente = cliente;
        this.dataFine = dataFine;
    }


    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public Veicoli getVeicolo() {
        return veicolo;
    }

    public Clienti getCliente() {
        return cliente;
    }

    public int getImportoTotale() {
        long giorni = ChronoUnit.DAYS.between(dataInizio, dataFine);
        if (giorni < 0) giorni = 0;
        return (int)(giorni * veicolo.getTariffaGiornaliera());
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public void setVeicolo(Veicoli veicolo) {
        this.veicolo = veicolo;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "DATA INIZIO NOLEGGIO: " + dataInizio +  "\n" +
                "DATA FINE NOLEGGIO: " + dataFine +  "\n" +
                "TOTALE NOLEGGIO: " + importoTotale +  "€";
    }
}
