package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class HiddenFigures {
    public static void main(String[] args){

        String quote = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        char[] quoteChars = quote.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (Character element : quoteChars){
                if(!charCount.containsKey(element)){
                    charCount.put(element, 0);
                }
        }

        for (Map.Entry<Character,Integer> totals : charCount.entrySet()) {
            for (Character element : quoteChars) {
                if(totals.getKey().equals(element)){
                    int totalChar = totals.getValue()+1;
                    charCount.replace(element,totalChar);
                }
            }
        }

        System.out.println(charCount);

    }



}
