package app.arraysAndStrings;

public class Ex1_1 {

    public static void main(String[] args) {
        System.out.println(checkIfStringHasUniqueCharactersCICT("pepe"));
        System.out.println(checkIfStringHasUniqueCharactersCICT("florencia"));
    }

    // 1.1 is unique
    private static boolean checkIfStringHasUniqueCharacters(String input) {
        for (int index = 0; index < input.length(); index++) {
            char aux = input.charAt(index);
            for (int j = 0; j < input.length(); j++) {
                if (aux == input.charAt(j) && index != j) {
                    return false;
                }
            }
        }
        return true;
    }

    // Solution
    private static boolean checkIfStringHasUniqueCharactersCICT(String input) {
        if (input.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }


}
