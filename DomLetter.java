//Aleksandr Kaletin

import java.util.*;
import java.io.*;

public class DomLetter {
    public static void main(String[] args) {
        HashMap<Character, Integer> mymap = new HashMap<Character, Integer>();
        Scanner input = new Scanner(System.in);
        int total = 0;

        //reads from file until has no new words
        while(input.hasNext()){
            //reads in word
            String word = input.next();

            //loop to check every char in the word
            for(int i = 0; i < word.length(); ++i){
                char c = word.charAt(i);
                int num = 0;

                //checks if the char is in range aka A-z
                if(c >= 'A' && c <= 'z'){
                    c = Character.toLowerCase(c);
                    //updates char count
                    if(mymap.get(c) != null){
                        num = mymap.get(c) + 1;
                    }else{
                        num = 1;
                    }
                    mymap.put(c, num);
                }else{
                    //clears map and stops checking each char
                    mymap.clear();
                    break;
                }
            }

            //checks to see if mymap is not empty
            if(!mymap.isEmpty()){
                //finds the largest amount in the hashmap and updates tota
                total += Collections.max(mymap.values());

                //clears map
                mymap.clear();
            }
        }

        //prints out total number
        System.out.println(total);
    }
}
