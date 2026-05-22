package basicPrograms;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
        String str = "testing programming";
        char[] chararr = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for (char ch:chararr){
            hs.add(ch);
        }
        System.out.println(hs.toString());
    }

}
