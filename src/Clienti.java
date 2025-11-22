public class Clienti {
    private String nome;
    private String cognome;
    private String numeroPatenteDiGuida;

    public Clienti() {
        this.nome = "";
        this.cognome = "";
        this.numeroPatenteDiGuida = "";
    }

    public Clienti(String nome, String cognome, String numeroPatenteDiGuida) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroPatenteDiGuida = numeroPatenteDiGuida;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumeroPatenteDiGuida() {
        return numeroPatenteDiGuida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumeroPatenteDiGuida(String numeroPatenteDiGuida) {
        this.numeroPatenteDiGuida = numeroPatenteDiGuida;
    }

    @Override
    public String toString() {
        return  "Nome e Cognome: "+ nome + " " + cognome + "\n" +
                "N. Patente: " + numeroPatenteDiGuida;
    }
}
