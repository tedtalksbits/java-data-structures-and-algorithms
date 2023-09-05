package dataStructures;

public class TwoDimensionalArray <T>{

    private T[][] twoDimensionalArr = null;

    public TwoDimensionalArray(T[][] twoDimensionalArr) {
        this.twoDimensionalArr = twoDimensionalArr;
    }

    public T[][] getTwoDimensionalArr() {
        return twoDimensionalArr;
    }

    public TwoDimensionalArray() {
    }

    public void setTwoDimensionalArr(Integer[][] twoDimensionalArr) {
        this.twoDimensionalArr = (T[][]) twoDimensionalArr;
    }

    public String getAllValues() {
        StringBuilder values = new StringBuilder();
        int rows = this.twoDimensionalArr.length;
        for (T[] ints : this.twoDimensionalArr) {
            int cols = ints.length;
            for (T anInt : ints) {
                System.out.println(anInt);
                values.append(anInt);
            }
        }
        return values.toString();
    }

    public String getRowAtIndex(int index) throws Exception {
        StringBuilder values = new StringBuilder();
        arrLengthCheck(index);
        System.out.println("Print out the "+ index + 1 +" row");
        T[] rowValues = twoDimensionalArr[index];
        for (T rowValue : rowValues) {
            System.out.println(rowValue);
            values.append(rowValue);
        }

        return values.toString();
    }

    private void arrLengthCheck(int index) throws Exception {
        if(index > twoDimensionalArr.length) {
            throw new Exception("Index must be between 0 and " + (twoDimensionalArr.length - 1));
        }

    }
}
