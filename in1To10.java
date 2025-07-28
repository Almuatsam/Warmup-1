public class in1To10 {
    public boolean in1T10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }
        else {
            return n >= 1 && n <= 10;
        }
    }
}
