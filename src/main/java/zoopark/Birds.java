package zoopark;

public class Birds extends abstractClass {
    private static String solovey;
    private static String petuh;
    private static String strays;
    public Birds() {
        breathe = "lungs"; // легкие
        moveAround = "wings"; // крылья;
        solovey = "solovey";
        petuh = "petuh";
        strays = "strays";
        type = "Birds";
    }
    public static String soloveyInfo() {
        return "I am a " + solovey + " and I sing";
    }
    public static String petuhInfo() {
        return "I am a " + petuh + " and I crow";
    }
    public static String straysInfo() {
        return "I am a " + strays + " and I don't fly";
    }
    public String getSolovey() {
        return soloveyInfo();
    }
    public String getPetuh() {
        return petuhInfo();
    }
    public String getStrays() {
        return straysInfo();
    }
}
