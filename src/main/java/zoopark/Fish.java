package zoopark;

public class Fish extends abstractClass {
    private static String akyla;
    private static String kit;
    private static String osminog;

    public Fish() {
        breathe = "gills"; // жабры
        moveAround = "fins"; // жабры
        akyla = "akyla";
        kit = "kit";
        osminog = "osminog";
        type = "Fish";
    }
    public static String akylaInfo() {
        return "I'm an " + akyla +" and I have sharp teeth";
    }
    public static String kitInfo() {
        return "I am a " + kit + " and I am a big fish";
    }
    public static String osminogInfo() {
        return "I am an " + osminog + " and I have many tentacles";
    }
    public static String getAkyla() {
        return akylaInfo();
    }
    public static String getKit() {
        return kitInfo();
    }
    public static String getOsminog() {
        return osminogInfo();
    }
}
