public class PhoneUser {
    private Phone phone; // Membuat variabel private phone yang merupakan objek dari kelas Phone

    public PhoneUser (Phone phone) {
        this.phone = phone;// Konstruktor untuk menginisialisasi objek Phone saat membuat objek PhoneUser
    }

    // Metode untuk menghidupkan ponsel
    void turnOnThePhone () {
        this.phone.powerOn();
    }

    // Metode untuk mematikan ponsel
    void turnOffThePhone () {
        this.phone.powerOff();
    }

    // Metode untuk meningkatkan volume ponsel
    void makePhoneLouder () {
        this.phone.volumeUp();
    }
    // Metode untuk mengurangi volume ponsel
    void makePhoneSilent () {
        this.phone.volumeDown();
    }

    // Metode untuk mendapatkan volume ponsel
   int getVolume (){
        return this.phone.getVolume();
   }
}