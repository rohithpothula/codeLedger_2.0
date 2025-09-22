package org.example;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main (String[] args){
        test t = new test();
        System.out.println(t.isomorphic("egg","add"));
        System.out.println(t.isomorphic("egge","addz"));
    }

    public boolean isomorphic(String s,String t){

        HashMap<Character,Character> m = new HashMap<>();


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                continue;
            }
            else{
                if(m.containsKey(s.charAt(i))){
                    Character temp = m.get(s.charAt(i));
                    if(temp!=t.charAt(i)){
                        return false;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    m.put(s.charAt(i),t.charAt(i));
                }
            }
        }
        return true;
    }
}
