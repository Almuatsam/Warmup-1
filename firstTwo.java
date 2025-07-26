public class firstTwo {
    public String firstT(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }
}
