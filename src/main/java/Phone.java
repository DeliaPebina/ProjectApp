public interface Phone {
    int MAX_VOLUME = 100; // Konstanta yang akan digunakan sebagai batas maksimum volume
    int MIN_VOLUME = 0; // Konstanta yang akan digunakan sebagai batas minimum volume

    void powerOn ();  // Metode untuk menghidupkan ponsel
    void powerOff (); // Metode untuk mematikan ponsel
    void volumeUp ();// Metode untuk menaikkan volume ponsel
    void volumeDown ();// Metode untuk mengurangi volume ponsel
    int getVolume();  // Metode untuk mendapatkan volume ponsel
}