import java.util.Scanner; //Program mengimpor kelas Scanner dari paket java.util
// untuk mengambil input dari pengguna melalui konsol.

public class ProjectApp {

    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        Phone iphone = new Iphone();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();

        PhoneUser delia = new PhoneUser(xiaomi);
        PhoneUser pebina = new PhoneUser(iphone);
        PhoneUser deldel = new PhoneUser(samsung);
        PhoneUser lia = new PhoneUser(oppo);

        Scanner input = new Scanner(System.in);

        int pil;

        do {
            System.out.println("APLIKASI INTERFACE");
            System.out.println("");
            System.out.println("Silahkan pilih HP");
            System.out.println("1. Xiaomi");
            System.out.println("2. Iphone");
            System.out.println("3. Samsung");
            System.out.println("4. Oppo");
            System.out.println("0. Keluar Aplikasi");
            System.out.println("");
            System.out.print("Pilih   : ");
            pil = input.nextInt();

            System.out.println("");
            System.out.println("");

            switch (pil) {
                case 1 :
                    do {
                        System.out.println("Menu HP Xiaomi");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("5. Tampilka Nilai Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                delia.turnOnThePhone();
                                break;
                            case 2 :
                                delia.turnOffThePhone();
                                break;
                            case 3 :
                                delia.makePhoneLouder();
                                break;
                            case 4 :
                                delia.makePhoneSilent();
                                break;
                            case 5 :
                                delia.getVolume();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah...");
                        }

                    } while (pil != 0);
                    break;
                case 2 :
                    do {
                        System.out.println("Menu HP Iphone");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("5. Tampilkan Nilai Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                pebina.turnOnThePhone();
                                break;
                            case 2 :
                                pebina.turnOffThePhone();
                                break;
                            case 3 :
                                pebina.makePhoneLouder();
                                break;
                            case 4 :
                                pebina.makePhoneSilent();
                                break;
                            case 5 :
                                pebina.getVolume();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 3 :
                    do {
                        System.out.println("Menu HP Samsung");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("5. Tampilkan Nilai Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                deldel.turnOnThePhone();
                                break;
                            case 2 :
                                deldel.turnOffThePhone();
                                break;
                            case 3 :
                                deldel.makePhoneLouder();
                                break;
                            case 4 :
                                deldel.makePhoneSilent();
                                break;
                            case 5 :
                                deldel.getVolume();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 4 :
                    do {
                        System.out.println("Menu HP Oppo");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("5. Tampilkan Nilai Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                lia.turnOnThePhone();
                                break;
                            case 2 :
                                lia.turnOffThePhone();
                                break;
                            case 3 :
                                lia.makePhoneLouder();
                                break;
                            case 4 :
                                lia.makePhoneSilent();
                                break;
                            case 5 :
                                lia.getVolume();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 0 :
                    System.out.println("Selamat tinggal....");
                    System.out.println("");
                    System.out.println("");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan salah....");
            }
        } while (pil != 0);
    }
}

/*
/Program di atas adalah aplikasi konsol sederhana yang memungkinkan pengguna untuk mengakses dan mengendalikan berbagai jenis ponsel
(Xiaomi, iPhone, Samsung, dan Oppo) dengan menggunakan interface Phone dan kelas-kelas yang mengimplementasikannya.
Aplikasi ini memiliki menu interaktif yang memungkinkan pengguna memilih ponsel yang akan dioperasikan dan melakukan berbagai tindakan
seperti menghidupkan ponsel, mematikannya, mengatur volume, dan menampilkan nilai volume.


 */