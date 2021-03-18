package app.arraysAndStrings;

public class Ex1_9 {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println("rotation result: " + rotation(s1, s2));
    }

    private static boolean rotation(String s1, String s2){
        String twoTimesS2 = s2+s2;
        return isSubstring(twoTimesS2, s1);
    }

    private static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }
}
