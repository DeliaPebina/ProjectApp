public class PhoneUser {
    private Phone phone;

    public PhoneUser (Phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone () {
        this.phone.powerOn();
    }

    void turnOffThePhone () {
        this.phone.powerOff();
    }

    void makePhoneLouder () {
        this.phone.volumeUp();
    }

    void makePhoneSilent () {
        this.phone.volumeDown();
    }

   int getVolume (){
        return this.phone.getVolume();
   }
}