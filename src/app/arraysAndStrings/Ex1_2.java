package app.arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class Ex1_2 {

    public static void main(String[] args) {
        Ex1_2 ex1_2 = new Ex1_2();
        System.out.println(ex1_2.permutation("pepe", "eepp"));
        System.out.println(ex1_2.permutation("pablo", "eepp"));
        System.out.println(ex1_2.permutation("pablo", "olbap"));
        System.out.println(ex1_2.permutation("pablo", "baplo"));
        System.out.println(ex1_2.permutation("pablo", "aaaaaaaaaaaaaaaaaaa"));
        System.out.println(ex1_2.permutation("pablo", "blopaasd"));
    }

    private boolean permutation(String base, String permutation){
        if(base.length() != permutation.length()) return false;
        return this.stringToMap(base).equals(this.stringToMap(permutation));
    }

    private Map<Integer, Integer> stringToMap(String input){
        Map<Integer, Integer> createdMap = new HashMap<>();
        for(int index = 0; index < input.length(); index++){
            int value = input.charAt(index);
            if(createdMap.containsKey(value)){
                createdMap.put(value, createdMap.get(value)+1);
            }else{
                createdMap.put(value, 1);
            }
        }
        return createdMap;
    }
}
