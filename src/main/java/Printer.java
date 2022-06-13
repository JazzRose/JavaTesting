public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;

    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }


    public void print(int pages, int copies) {
        int total = pages * copies;
        int tonerUsed = total;
        if (total <= sheetsOfPaper){
            sheetsOfPaper -= total;
            tonerVolume -= tonerUsed;

        }


    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
