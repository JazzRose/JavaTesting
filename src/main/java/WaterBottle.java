public class WaterBottle {

    private int volume = 100;

    public WaterBottle(){
    }

    public int drink() {
        volume = volume - 10;
        return volume;
    }

    public int getVolume() {
        return volume;
    }

    public int emptyWaterBottle() {
        volume = 0;
        return volume;
    }

    public int fillWaterBottle() {
        volume = 100;
        return volume;
    }
}
