public class parrotTrouble {
    public boolean parrot(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

}
