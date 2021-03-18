package app.arraysAndStrings;

public class Ex1_3 {

    public static void main(String[] args) {
        Ex1_3 ex = new Ex1_3();
        System.out.println(ex.reformat("Mr John Smith    ".toCharArray(), 13));

    }

    private char[] reformat(char[] str, int trueLength) {
        int spaceCount = 0, index, i;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;

        if (trueLength < str.length) str[trueLength] = '\0'; //end array
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return str;
    }
}
