public class missingChar {
    public String missingC(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }
}
