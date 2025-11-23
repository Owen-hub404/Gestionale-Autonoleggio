import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static final String DIVISORE = "--------------------------------------------------------------------";
    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Veicoli> veicolis = new ArrayList<>();
    private static ArrayList<Clienti> clientis = new ArrayList<>();
    private static ArrayList<Noleggi> noleggis = new ArrayList<>();



    public static void main(String[] args) {


        while (true) {

            /*
            System.out.println(DIVISORE);
            System.out.println("***** AUTONOLEGGIO *****");
            System.out.println("Cosa vuoi fare?");
            System.out.println("1 - Registra Autovettura");
            System.out.println("2 - Regisra Furgone");
            System.out.println("3 - Registra Cliente");
            System.out.println("4 - Registra Noleggio");
            System.out.println("5 - Lista Veicoli");
            System.out.println("6 - Lista Clienti");
            System.out.println("7 - Lista Noleggi");
            System.out.println("0 - Esci");
            System.out.println(DIVISORE);
            int scelta = scanner.nextInt();
            scanner.nextLine();
            System.out.println(DIVISORE);


            switch (scelta) {
                case 1:
                    System.out.println("*************** Registrazione Autovettura ***************");

                    Autovetture a = new Autovetture();

                    System.out.println("Inserire Marca: ");
                    a.setMarca(scanner.nextLine());

                    System.out.println("Inserire Modello: ");
                    a.setModello(scanner.nextLine());

                    System.out.println("Inserire Numero di Targa: ");
                    a.setNumeroDiTarga(scanner.nextLine());

                    System.out.println("Inserire tariffa giornaliera: ");
                    a.setTariffaGiornaliera(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println("Inserire Numero di porte: ");
                    a.setNumeroDiPorte((byte) scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Inserire numero di posti: ");
                    a.setNumeroDiPosti((byte) scanner.nextInt());
                    scanner.nextLine();

                    veicolis.add(a);

                    System.out.println("Veicolo registrato correttamente");
                    break;



                case 2:
                    System.out.println("*************** Registrazione Furgone ***************");

                    Furgoni b = new Furgoni();

                    System.out.println("Inserire Marca: ");
                    b.setMarca(scanner.nextLine());

                    System.out.println("Inserire Modello: ");
                    b.setModello(scanner.nextLine());

                    System.out.println("Inserire Numero di Targa: ");
                    b.setNumeroDiTarga(scanner.nextLine());

                    System.out.println("Inserire tariffa giornaliera: ");
                    b.setTariffaGiornaliera(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println("Inserire portata in Kg: ");
                    b.setPortataInKg(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Inserire dimensioni separate da virgola: (Lunghezza, larghezza e altezza in cm)");
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");

                    if (parts.length == 3) {
                        String lunghezza = parts[0].trim();
                        String larghezza = parts[1].trim();
                        String altezza = parts[2].trim();

                        b.setDimensioni(lunghezza, larghezza, altezza);
                    }else
                        System.out.println("Errore: devi inserire 3 valori separati da virgola");




                    veicolis.add(b);

                    System.out.println("Veicolo registrato correttamente");
                    break;



                case 3:
                    System.out.println("*************** Registrazione Cliente ***************");

                    Clienti c = new Clienti();

                    System.out.println("Inserire Nome: ");
                    c.setNome(scanner.nextLine());

                    System.out.println("Inserire Cognome");
                    c.setCognome(scanner.nextLine());

                    System.out.println("Inserire Numero Patente");
                    c.setNumeroPatenteDiGuida(scanner.nextLine());

                    clientis.add(c);

                    System.out.println();
                    System.out.println("Cliente registrato correttamente");
                    break;



                case 4:
                    System.out.println("*************** Registrazione Noleggio ***************");

                    if (veicolis.isEmpty()) {
                        System.out.println("\nNessun veicolo registrato. Registra prima un veicolo.\n");
                        break;
                    }
                    if (clientis.isEmpty()) {
                        System.out.println("\nNessun cliente registrato. Registra prima un cliente.\n");
                        break;
                    }

                    System.out.println("Digitare data di fine noleggio (aaaa-mm-gg): ");
                    String fineNoleggio = scanner.nextLine();
                    LocalDate dataFine = LocalDate.parse(fineNoleggio);

                    System.out.println("Scegliere un veicolo: \n");
                    for (int i = 0; i < veicolis.size(); i++) {
                        System.out.println("Veicolo " + (i+1) + ":\n" + veicolis.get(i));
                        System.out.println(DIVISORE);
                    }

                    System.out.println("Scegliere un veicolo (1-" + veicolis.size() + "): ");
                    int sceltaVeicolo = scanner.nextInt();
                    scanner.nextLine();

                    if (sceltaVeicolo < 1 || sceltaVeicolo > veicolis.size()) {
                        System.out.println("Scelta veicolo non valida.");
                        break;
                    }

                    Veicoli veicoloScelto = veicolis.get(sceltaVeicolo - 1);



                    System.out.println("Scegliere un cliente: ");
                    for (int i = 0; i < clientis.size(); i++) {
                        System.out.println( "Cliente "+ (i+1) + ":\n" + clientis.get(i));
                        System.out.println(DIVISORE);
                    }

                    int sceltaCliente = scanner.nextInt();
                    scanner.nextLine();

                    if (sceltaCliente < 0 || sceltaCliente >= clientis.size()) {
                        System.out.println("Scelta cliente non valida.");
                        break;
                    }

                    Clienti clienteScelto = clientis.get(sceltaCliente);

                    Noleggi n = new Noleggi(veicoloScelto, clienteScelto, dataFine);
                    noleggis.add(n);

                    System.out.println("\nNoleggio registrato correttamente!\n");
                    break;




                case 5:
                    System.out.println("*************** Lista Veicoli ***************");

                    if (veicolis.size() == 0) {
                        System.out.println("\nAl momento non risultano veicoli registrati\n");

                    } else
                        for (int i = 0; i < veicolis.size(); i++) {
                            System.out.println("\nVeicolo " + (i+1) + "\n" + veicolis.get(i) + "\n");
                        }

                    break;

                case 6:
                    System.out.println("*************** Lista Clienti ***************");

                    if (clientis.size() == 0) {
                        System.out.println("\nAl momento non risultano clienti registrati,\n");
                    }else
                        for (int i = 0; i < clientis.size(); i++) {
                            System.out.println("\nCliente " + (i+1) + "\n" + clientis.get(i) + "\n");
                        }
                    break;

                case 7:
                    System.out.println("*************** Lista Noleggi ***************");

                    if (noleggis.size() == 0) {
                        System.out.println("\nAl momento non risultano noleggi registrati.\n");
                    }else {
                        for (int i = 0; i < noleggis.size(); i++) {
                            Noleggi noleggio = noleggis.get(i);
                            Veicoli veicolo = noleggio.getVeicolo();
                            Clienti cliente = noleggio.getCliente();

                            String tipoVeicolo = (veicolo instanceof Autovetture) ? "Autovettura" : "Furgone";

                            System.out.println(
                                    "\nNoleggio " + (i + 1) + "\n" +
                                            "Tipo veicolo: " + tipoVeicolo + "\n" +
                                            veicolo + "\n" +  // toString del veicolo
                                            "Cliente: " + cliente.getNome() + " " + cliente.getCognome() + ", Patente: " + cliente.getNumeroPatenteDiGuida() + "\n" +
                                            "Data inizio: " + noleggio.getDataInizio() + ", Data fine: " + noleggio.getDataFine() + "\n" +
                                            "Importo totale: " + noleggio.getImportoTotale() + "€\n");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Arrivederci");
                    System.exit(0);

                default:
                    System.out.println("Scelta non valida");
                    break;
            }
             */


            mostraMenu();
            int scelta = leggiIntero("Scegli un opzione: ");
            System.out.println(DIVISORE);

            switch (scelta) {
                case 1 -> registraAutovettura();
                case 2 -> registraFurgone();
                case 3 -> registraCliente();
                case 4 -> registraNoleggio();
                case 5 -> listaVeicoli();
                case 6 -> listaClienti();
                case 7 -> listaNoleggi();
                case 0 -> {
                    System.out.println("Arrivederci!");
                    System.exit(0);
                }
                default -> System.out.println("Scelta non valida.");
            };


        }
    }

    private static void mostraMenu() {
        System.out.println(DIVISORE);
        System.out.println("***** AUTONOLEGGIO *****");
        System.out.println("1 - Registra Autovettura");
        System.out.println("2 - Registra Furgone");
        System.out.println("3 - Registra Cliente");
        System.out.println("4 - Registra Noleggio");
        System.out.println("5 - Lista Veicoli");
        System.out.println("6 - Lista Clienti");
        System.out.println("7 - Lista Noleggi");
        System.out.println("0 - Esci");
        System.out.println(DIVISORE);
    }

    private static int leggiIntero(String messaggio) {
        while (true) {
            try {
                System.out.print(messaggio);
                int numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }
    }

    private static double leggiDouble(String messaggio) {
        while (true) {
            try {
                System.out.print(messaggio);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }
    }

    private static void registraAutovettura() {
        System.out.println("*************** Registrazione Autovettura ***************");

        Autovetture a = new Autovetture();

        System.out.print("Marca: ");
        a.setMarca(scanner.nextLine());

        System.out.print("Modello: ");
        a.setModello(scanner.nextLine());

        System.out.print("Numero di Targa: ");
        a.setNumeroDiTarga(scanner.nextLine());

        a.setTariffaGiornaliera(leggiDouble("Tariffa giornaliera: "));
        a.setNumeroDiPorte((byte) leggiIntero("Numero di porte: "));
        a.setNumeroDiPosti((byte) leggiIntero("Numero di posti: "));

        veicolis.add(a);
        System.out.println("Autovettura registrata correttamente.");
    }

    private static void registraFurgone() {
        System.out.println("*************** Registrazione Furgone ***************");

        Furgoni f = new Furgoni();

        System.out.print("Marca: ");
        f.setMarca(scanner.nextLine());

        System.out.print("Modello: ");
        f.setModello(scanner.nextLine());

        System.out.print("Numero di Targa: ");
        f.setNumeroDiTarga(scanner.nextLine());

        f.setTariffaGiornaliera(leggiDouble("Tariffa giornaliera: "));
        f.setPortataInKg(leggiIntero("Portata in Kg: "));

        System.out.print("Dimensioni (Lunghezza,Larghezza,Altezza in cm): ");
        String[] dim = scanner.nextLine().split(",");
        if (dim.length == 3) f.setDimensioni(dim[0].trim(), dim[1].trim(), dim[2].trim());
        else System.out.println("Errore: inserisci 3 valori separati da virgola.");

        veicolis.add(f);
        System.out.println("Furgone registrato correttamente.");
    }

    private static void registraCliente() {
        System.out.println("*************** Registrazione Cliente ***************");

        Clienti c = new Clienti();

        System.out.print("Nome: ");
        c.setNome(scanner.nextLine());

        System.out.print("Cognome: ");
        c.setCognome(scanner.nextLine());

        System.out.print("Numero Patente: ");
        c.setNumeroPatenteDiGuida(scanner.nextLine());

        clientis.add(c);
        System.out.println("Cliente registrato correttamente.");
    }

    private static void registraNoleggio() {
        System.out.println("*************** Registrazione Noleggio ***************");

        if (veicolis.isEmpty()) { System.out.println("Nessun veicolo registrato."); return; }
        if (clientis.isEmpty()) { System.out.println("Nessun cliente registrato."); return; }

        System.out.print("Data fine noleggio (aaaa-mm-gg): ");
        LocalDate dataFine = LocalDate.parse(scanner.nextLine());

        System.out.println("Scegli veicolo:");
        for (int i = 0; i < veicolis.size(); i++) {
            System.out.println((i + 1) + " - " + veicolis.get(i));
        }
        int sceltaVeicolo = leggiIntero("Seleziona numero veicolo: ");
        if (sceltaVeicolo < 1 || sceltaVeicolo > veicolis.size()) {
            System.out.println("Scelta veicolo non valida."); return;
        }
        Veicoli veicoloScelto = veicolis.get(sceltaVeicolo - 1);

        System.out.println("Scegli cliente:");
        for (int i = 0; i < clientis.size(); i++) {
            System.out.println((i + 1) + " - " + clientis.get(i));
        }
        int sceltaCliente = leggiIntero("Seleziona numero cliente: ");
        if (sceltaCliente < 1 || sceltaCliente > clientis.size()) {
            System.out.println("Scelta cliente non valida."); return;
        }
        Clienti clienteScelto = clientis.get(sceltaCliente - 1);

        Noleggi n = new Noleggi(veicoloScelto, clienteScelto, dataFine);
        noleggis.add(n);

        System.out.println("Noleggio registrato correttamente!");
    }

    private static void listaVeicoli() {
        System.out.println("*************** Lista Veicoli ***************");
        if (veicolis.isEmpty()) System.out.println("Nessun veicolo registrato.");
        else veicolis.forEach(System.out::println);
    }

    private static void listaClienti() {
        System.out.println("*************** Lista Clienti ***************");
        if (clientis.isEmpty()) System.out.println("Nessun cliente registrato.");
        else clientis.forEach(System.out::println);
    }

    private static void listaNoleggi() {
        System.out.println("*************** Lista Noleggi ***************");
        if (noleggis.isEmpty()) System.out.println("Nessun noleggio registrato.");
        else {
            for (int i = 0; i < noleggis.size(); i++) {
                Noleggi n = noleggis.get(i);
                Veicoli v = n.getVeicolo();
                Clienti c = n.getCliente();
                String tipo = (v instanceof Autovetture) ? "Autovettura" : "Furgone";
                System.out.println("\nNoleggio " + (i + 1) +
                        "\nTipo veicolo: " + tipo +
                        "\n" + v +
                        "\nCliente: " + c.getNome() + " " + c.getCognome() + ", Patente: " + c.getNumeroPatenteDiGuida() +
                        "\nData inizio: " + n.getDataInizio() + ", Data fine: " + n.getDataFine() +
                        "\nImporto totale: " + n.getImportoTotale() + "€\n");
            }
        }
    }
}
