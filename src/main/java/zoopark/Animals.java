package zoopark;

public class Animals extends abstractClass {
    private static String lion;
    private static String cat;
    private static String dog;

    public Animals() {
        breathe = "lungs"; // легкие
        moveAround = "paws"; // лапы
        lion = "lion";
        cat = "cat";
        dog = "dog";
        type = "Animals";
    }
    public static String lionInfo() {
        return "I am a " + lion + " and I roar";
    }

    public static String catInfo() {
        return "I am a " + cat + " and I am meow";
    }

    public static String dogInfo() {
        return "I am a " + dog + " and I bark";
    }

    public String getLion() {
        return lionInfo();
    }
    public String getCat() {
        return catInfo();
    }

    public String getDog() {
        return dogInfo();
    }

    public static String lionName() {
        return lion;
    }
}