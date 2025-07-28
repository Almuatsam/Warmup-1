public class cigarParty {
    public boolean cigarPart(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        }
        else {
            return cigars >= 40 && cigars <= 60;
        }
    }

}
