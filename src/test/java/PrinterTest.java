import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(50, 300);
    }

    @Test
    public void countSheetsOfPaper(){
        assertEquals(50,myPrinter.getSheetsOfPaper());
    }

    @Test
    public void tryToPrint10Pages(){
        myPrinter.print(10, 1);
        assertEquals(40,myPrinter.getSheetsOfPaper());
    }

    @Test
    public void tryToPrint30Pages(){
        myPrinter.print(10, 1);
        myPrinter.print(20,1);
        assertEquals(20,myPrinter.getSheetsOfPaper());
    }

    @Test
    public void tryToPrint2Copies(){
        myPrinter.print(20, 2);
        assertEquals(10,myPrinter.getSheetsOfPaper());
    }

    @Test
    public void tryToPrintTooManyCopies(){
        myPrinter.print(20, 3);
        assertEquals(50,myPrinter.getSheetsOfPaper());

    }
    @Test
    public void checkTonerVolumeReduced(){
        myPrinter.print(20, 2);
        assertEquals(260,myPrinter.getTonerVolume());
    }


}
