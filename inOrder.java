public class inOrder {
    public boolean inOder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        }
        else {
            return b > a && c > b;
        }
    }
}
