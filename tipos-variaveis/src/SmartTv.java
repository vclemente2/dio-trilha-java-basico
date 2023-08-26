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
        tv.reduceVolume();
        tv.toggleOnOff();
        tv.reduceVolume();
        tv.changeChannel(10);
        tv.increaseChannel();
        tv.reduceChannel();
        tv.reduceChannel();
        tv.reduceChannel();

    }

    public void increaseVolume() {
        if (this.on) {
            this.printVolume(++this.volume);
        } else {
            System.out.println("The tv must be on to change the volume.");
        }
    }

    public void reduceVolume() {
        if (this.on) {
            this.printVolume(--this.volume);
        } else {
            System.out.println("The tv must be on to change the volume.");
        }
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        this.printChannel(channel);
    }

    public void increaseChannel() {
        if (this.on) {
            this.changeChannel(++this.channel);
        } else {
            System.out.println("The tv must be on to change the channel.");
        }
    }

    public void reduceChannel() {
        if (this.on) {
            this.changeChannel(--this.channel);
        } else {
            System.out.println("The tv must be on to change the channel.");
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

    private void printChannel(int channel) {
        System.out.println("Channel: " + channel);
    }

}
