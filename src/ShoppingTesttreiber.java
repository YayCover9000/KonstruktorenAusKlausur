public class ShoppingTesttreiber {
    public static void main (String [] args) {

        // Objekt für Default Konstruktor
        Shopping wertDefault = new Shopping();
        wertDefault.ausgebenWert();
        // Objekt erstellen (Instanz) für instanzKonstruktor
        Shopping wert = new Shopping(15,51);
        wert.ausgebenWert();
    }
}
