package studioCountingCharacters;
import java.util.Scanner;
import java.util.HashMap;
public class CountingCharacters2 {

    public static void main(String[] args){
        String prompt = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = prompt.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i  < charactersInString.length; i++){
            characters.merge(charactersInString[i], 1, Integer::sum);
        }
        for (HashMap.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());


        }
    }

}


