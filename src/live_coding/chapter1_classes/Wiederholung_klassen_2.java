package live_coding.chapter1_classes;
// class defineiren
class Auto {
    int geschwindigkeit=7;
    String marke;
    int jahr;
    char farbe;
}

class Haus {
    int anzahllfenster=7;
    char farbe;
}

public class Wiederholung_klassen_2 {
    public static void main(String[] args) {
        // objekte erstellen - Instanz
        Auto auto_objekt_raghad = new Auto();
        Auto auto_objekt_hala = new Auto();

        Haus haus_objekt_sedra = new Haus();

        // Objekte initisalisieren - "ausfuellen"
        System.out.println(auto_objekt_raghad.geschwindigkeit);
        System.out.println(auto_objekt_raghad.marke);
        System.out.println(auto_objekt_raghad.jahr);
        System.out.println(auto_objekt_raghad.farbe);

        auto_objekt_raghad.geschwindigkeit = 300;
        auto_objekt_raghad.farbe = 'R';
        auto_objekt_raghad.jahr = 2020;
        auto_objekt_raghad.marke = "bmw";

        System.out.println(auto_objekt_raghad.geschwindigkeit);
        System.out.println(auto_objekt_raghad.marke);
        System.out.println(auto_objekt_raghad.jahr);
        System.out.println(auto_objekt_raghad.farbe);

        System.out.println("=======");
        System.out.println(auto_objekt_hala.geschwindigkeit);
        System.out.println(auto_objekt_hala.marke);
        System.out.println(auto_objekt_hala.jahr);
        System.out.println(auto_objekt_hala.farbe);
        System.out.println("=======");

        auto_objekt_hala.farbe = 'S';
        System.out.println(auto_objekt_hala.geschwindigkeit);
        System.out.println(auto_objekt_hala.marke);
        System.out.println(auto_objekt_hala.jahr);
        System.out.println(auto_objekt_hala.farbe);

        haus_objekt_sedra.anzahllfenster = 5;
        haus_objekt_sedra.farbe = 'g';


//        int r = 5;
//
//
//        int x1 = 5;
//        int x2 = 7;
////        int[] x = {500, "bmw", 2026, 'W'};
//        int[] x = {500,  2026, 54};
//        System.out.println(x);
//        System.out.println(x[0]);
//        System.out.println(x[1]);
//        System.out.println(x[2]);
//
//
//        // deklarieren
//        int y;
//        // initialiseren
//        y = 6;
//
//        // oder auf einmal: dekl. und inti.
//        int z = 7;

    }
}
