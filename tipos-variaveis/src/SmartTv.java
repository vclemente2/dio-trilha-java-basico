public class SmartTv {
    private int volume = 0;
    private int channel = 1;
    private boolean on = false;

    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        tv.toggleOnOff();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.toggleOnOff();

    }

    public void increaseVolume() {
        if (this.on) {
            this.printVolume(++this.volume);
        } else {
            System.out.println("The tv must be on to change the volume.");
        }
    }

    public void toggleOnOff() {
        this.on = !this.on;
        String tvStatus = this.on ? "Tv on" : "Tv off";
        System.out.println(tvStatus);
    }

    private void printVolume(int volume) {
        System.out.println("Volume: " + volume);
    }

}
