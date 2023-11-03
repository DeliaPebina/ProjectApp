    public class Samsung implements Phone {
        private int volume;
        private boolean isPowerOn;

        // Konstruktor
        public Samsung () {
            this.volume = 50; // Menginisialisasi volume ke 50 saat objek Samsung dibuat
        }

        // Implementasi metode powerOn dari interface Phone
        public void powerOn () {
            isPowerOn = true;
            System.out.println("Handphone menyala...");
        }

        // Implementasi metode powerOff dari interface Phone
        public void powerOff () {
            isPowerOn = false;
            System.out.println("Handphone dimatikan");
        }

        // Implementasi metode volumeUp dari interface Phone
        public void volumeUp() {
            if (isPowerOn) {
                if (this.volume == MAX_VOLUME) {
                    System.out.println("Volume FULL!!");
                    System.out.println("sudah " + this.getVolume() + "%");
                } else {
                    this.volume += 10;
                    System.out.println("Volume sekarang: " + this.getVolume());
                }
            } else {
                System.out.println("Nyalakan dulu donk HP-nya!!");
            }
        }

        // Implementasi metode volumeDown dari interface Phone
        public void volumeDown() {
            if (isPowerOn) {
                if (this.volume == MIN_VOLUME) {
                    System.out.println("Volume = 0%");
                } else {
                    this.volume -= 10;
                    System.out.println("Volume sekarang: " + this.getVolume());
                }
            } else {
                System.out.println("Nyalakan dulu donk HP-nya!!");
            }
        }

        // Implementasi metode getVolume dari interface Phone
        public int getVolume() {
            return this.volume;
        }
    }

    /*
    Kelas Samsung adalah contoh konkret dari ponsel merek "Samsung"
    yang mengikuti kontrak yang didefinisikan oleh interface Phone.
    Program ini memungkinkan pengguna untuk menggunakan metode-metode yang sesuai
    untuk mengendalikan ponsel Samsung,
     */