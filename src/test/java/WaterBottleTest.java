import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new WaterBottle();
    }

    @Test
    public void getVolumeOfBottle(){
        assertEquals(100,myWaterBottle.getVolume());
    }

    @Test
    public void drinkFromBottleRemoves10(){
        assertEquals(90,myWaterBottle.drink());
    }

    @Test
    public void drinkThriceFromBottleRemoves30(){
         myWaterBottle.drink();
         myWaterBottle.drink();
         myWaterBottle.drink();
        assertEquals(70,myWaterBottle.getVolume());
    }

    @Test
    public void checkBottleHasBeenEmptied(){
        assertEquals(0,myWaterBottle.emptyWaterBottle());
    }

    @Test
    public void checkBottleHasBeenFilled(){
        myWaterBottle.fillWaterBottle();
        assertEquals(100,myWaterBottle.fillWaterBottle());
    }

    @Test
    public void checkBottleHasBeenFilledAgain(){
        myWaterBottle.emptyWaterBottle();
        myWaterBottle.fillWaterBottle();
        assertEquals(100,myWaterBottle.getVolume());
    }

}
