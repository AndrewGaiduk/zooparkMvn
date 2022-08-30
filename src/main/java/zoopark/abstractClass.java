package zoopark;

public class abstractClass {
    protected static String breathe;
    protected static String moveAround;
    protected  static  String type;

    public static String getLivingCreatures() {
        return type + " breathe with their " + breathe + " and moving around " + moveAround;
    }

    public String getBreathe() {
        return breathe;
    }

    public String getMoveAround() {
        return moveAround;
    }


}
