package live_coding.chapter1_classes;

// 4 Arten von Methoden
// 1. Ohne Rueckgabewert, Ohne Argumente
// 2. Ohne Rueckgabewert (void), Mit Argumente
// 3. Mit Rueckgabewert (return), Ohne Argumente
// 4. Mit Rueckgabewert (return), Mit Arguemnte

// void methoden duerfen nicht geprintet werden
// void und return koennen nicht zusammen kommen
// Normalerweise: der zweck von "Mit Rueckgabewert (return)" methoden ist eine Variable zuerueck zu geben und NICHT zu printen.
// Normalerweise: der zweck von "Ohne Rueckgabewert (void)" methoden ist etwas zu printen.
public class Wiederholung_methoden_1 {

    // 1. Ohne Rueckgabewert (void), Ohne Argumente
    public static void printSomething(){
        System.out.println("somthing...");
        System.out.println("somthing...");
        System.out.println("somthing...");
    }

    // 2. Ohne Rueckgabewert (void), Mit Argumente
    public static void printSomethingSpezifisch(int wieOft, String symbol){
        for(int i = 0; i < wieOft; i++){
            System.out.println(symbol);
        }
    }

    // 3. Mit Rueckgabewert (return), Ohne Argumente
    public static String returnHala(){
        String name = "Hala";
        return name;
    }

    // 4. Mit Rueckgabewert (return), Mit Arguemnte
    public static int berechneFlaeche(int laenge, int breite){
        int flaeche = laenge * breite;
        System.out.println(flaeche);
        return flaeche;
    }


    // 4. ohne Rueckgabewert (void), Mit Arguemnte
    public static void berechneFlaeche2(int laenge, int breite){
        int flaeche = laenge * breite;
        System.out.println(flaeche);
    }





    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        printSomething(); //3 mal
        printSomethingSpezifisch(9, "$"); // 4 mal
        String myName = returnHala();

        int flaeche1 = berechneFlaeche(2, 4);
        int flaeche2 = berechneFlaeche(4, 6);
        int flaeche3 = berechneFlaeche(2, 7);

        System.out.println(flaeche2);
        int ergebnis = flaeche2 * 2 + 10;

        berechneFlaeche2(5, 6);


    }


}









//
//    // Methode definieren
//    public static void printWelt(String welt){
//        String welt
//    }
//