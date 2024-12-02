/*
 * Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */

import java.util.Scanner;

public class WordOccursSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String searchWord = sc.nextLine();
        String[] words = sentence.split(" ");
        int index = -1;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(searchWord) == 0){
                index = i+1;
                break;
            }
        }
        System.out.println(index);
    }
}
