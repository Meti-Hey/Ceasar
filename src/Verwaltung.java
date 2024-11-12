public class Verwaltung {
    private Scanner scanner;
    private Caeser caeser;

    public static void main(string[] args) {
        new Verwaltung();
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] verschluessen");
            System.out.println("[2] entschluessen");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Gib das Wort an, welches Sie verschluesseln wollen:");
                String schluesselString = scanner.nextLine();
                this.test.setEingabe(entschluessen);
                this.test.entschluessen();

            } else if (option == 2) {
                // this.sendMessage();
                System.out.println("Gib das Wort an, welches Sie entschluesseln wollen:");
                String zeichenkette = scanner.nextLine();
                this.test.setEingabe(zeichenkette);
                this.test.palindromTest();
                System.out.println("Gib den Schluessel an : " + this.test.isIstPalindrom());
            }

            }
            System.out.println();
        }
    }

}

 }