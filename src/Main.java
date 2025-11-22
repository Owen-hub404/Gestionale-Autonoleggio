import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String divisore = "--------------------------------------------------------------------";

        Scanner scanner = new Scanner(System.in);

        ArrayList<Veicoli> veicolis = new ArrayList<>();
        ArrayList<Clienti> clientis = new ArrayList<>();
        ArrayList<Noleggi> noleggis = new ArrayList<>();

        while (true) {
            System.out.println(divisore);
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
            System.out.println(divisore);
            int scelta = scanner.nextInt();
            scanner.nextLine();
            System.out.println(divisore);

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

                    System.out.println("Inserire dimensioni separate da virgola: (Lunghezza, larghezza e altezza in cm)");
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");

                    if (parts.length == 3) {
                        String lunghezza = scanner.nextLine();
                        String larghezza = scanner.nextLine();
                        String altezza = scanner.nextLine();
                        b.setDimensioni(lunghezza, larghezza, altezza);

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
                        System.out.println("\n" + "Nessun veicolo registrato. Registra prima un veicolo." + "\n");
                        break;
                    }
                    if (clientis.isEmpty()) {
                        System.out.println("\n" + "Nessun cliente registrato. Registra prima un cliente." + "\n");
                        break;
                    }


                    System.out.println("Digitare data di fine noleggio:  (aaaa-mm-gg)");
                    String fineNoleggio = scanner.nextLine();
                    LocalDate data = LocalDate.parse(fineNoleggio);
                    noleggis.


                            System.out.println("Scegliere un veicolo: ");
                    int sceltaVeicolo = scanner.nextInt();


                    for (int i = 0; i < veicolis.size(); i++) {
                        System.out.println(i + " - " + veicolis.get(i));
                        System.out.println(divisore);
                    }


                    System.out.println("Scegliere un cliente: ");
                    int sceltaCliente = scanner.nextInt();


                    for (int i = 0; i < clientis.size(); i++) {
                        System.out.println((i+1) + " - " + clientis.get(i));
                        System.out.println(divisore);
                    }


                    System.out.println("Noleggio registrato correttamente");
                    System.out.println(divisore);
                    break;



                case 5:
                    System.out.println("*************** Lista Veicoli ***************");

                    if (veicolis.size() == 0) {
                        System.out.println();
                        System.out.println("NON CI SONO VEICOLI REGISTRATI");
                        System.out.println();
                    } else
                        for (int i = 0; i < veicolis.size(); i++) {
                            System.out.println("\n" + "Veicolo " + (i+1) + "\n" + veicolis.get(i) + "\n");
                        }

                    break;

                case 6:
                    System.out.println("*************** Lista Clienti ***************");

                    if (clientis.size() == 0) {
                        System.out.println();
                        System.out.println("NON CI SONO CLIENTI REGISTRATI");
                        System.out.println();
                    }else
                        for (int i = 0; i < clientis.size(); i++) {
                            System.out.println("\n" + "Cliente " + (i+1) + "\n" + clientis.get(i) + "\n");
                        }
                    break;

                case 7:
                    System.out.println("*************** Lista Noleggi ***************");


                    System.out.println();

                    break;

                case 0:
                    System.out.println("Arrivederci");
                    System.exit(0);

                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
    }
}
