package infy;

import java.util.ArrayList;
import java.util.List;
/*
Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet. Also find the missing alphabets.
Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
 */
public class IsPangram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";

        s=s.toLowerCase();

        List<Character> alpha=new ArrayList<Character>();

        for(char i= 'a';i<='z';i++)
            alpha.add(i);

        char[] charray=s.toCharArray();
        //to show all missing chars
        for(Character c : charray){
            if(alpha.contains(c))
                alpha.remove(c);
        }

        if(alpha.size()==0)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");

        System.out.println(alpha);
    }
}
