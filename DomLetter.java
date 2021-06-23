import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.*;

public class DomLetter {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character, Integer> mymap = new HashMap<Character, Integer>();
        Scanner input = new Scanner(new File(args[0]));
        int total = 0;

        //reads from file until has no new lines
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

                    //TODO
                    //System.out.print(c);
                    //System.out.print(mymap.get(c));

                }else{
                    mymap.clear();
                    break;
                }
           }

                if(!mymap.isEmpty()){
                    //finds the largest amount in the hashmap
                    total += Collections.max(mymap.values());
                    //System.out.print(Collections.max(mymap.values()));
                    //System.out.print(total);

                    //update total and clear map
                    mymap.clear();
                }

        }

        System.out.println(total);
    }
}
