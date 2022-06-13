public class Calculator {

    private int value1;
    private int value2;

    public Calculator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public int addValues(){
        return value1 + value2;
    }

    public int multiplyValues() {
        return value1 * value2;
    }

    public int subtractValues() {
        return value1-value2;
    }
}
