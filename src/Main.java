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
            }
    }
}
