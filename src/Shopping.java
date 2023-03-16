public class Shopping {
    //Bitte Insanzvariablen nicht verändern
    float weight;
    float price;

    // 1.) Konstruktor erstellen
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
