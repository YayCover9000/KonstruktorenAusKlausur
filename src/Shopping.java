public class Shopping {
    //Bitte Insanzvariablen nicht verändern
    float weight;
    float price;

    // Default Konstruktor
    Shopping () {
        System.out.println("Das ist ein Default Konstruktor");
    }
    // InstanzKonstruktor erstellen
    Shopping (float weightValue, float priceValue) {
        weight = weightValue;
        price = priceValue;
        System.out.println("Das ist der Initialisierungskonstruktor");
    }
    // Wichtig die Methode "erwartet" keinen Wert
    void ausgebenWert () {
        System.out.println("Weight: " + weight + "\nPrice: " + price);
    }

}
