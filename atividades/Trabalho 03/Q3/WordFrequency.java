import java.util.Scanner;
import java.util.ArrayList;

public class WordFrequency{
    int wordCount = 0;
    int wordCountDistinct = 0;
    Scanner in;
    String line;

    public WordFrequency(){
        in = new Scanner(System.in);
        line = in.nextLine();
        line += " ";

        this.count();

        in.close();
    }

    public void count(){
        String auxWord = new String();
        ArrayList<String> words = new ArrayList();
        ArrayList<Integer> freq = new ArrayList();
        boolean repeated = false;
        int repeatedind = 0;

        for(char c : line.toCharArray()){
            if(c != ' '){
                auxWord += c;
            } else {
                wordCount++;
                repeated = false;
                repeatedind = 0;

                for(int i = 0; i < words.size(); i ++){
                    if(words.get(i).equals(auxWord)){
                        repeated = true;
                        repeatedind = i;
                    }
                }

                if(!repeated){
                    wordCountDistinct++;
                    words.add(auxWord);
                    freq.add(1);
                } else {                    
                    int v = freq.get(repeatedind) + 1;
                    freq.set(repeatedind, v);
                }

                auxWord = new String();
            }
        }

        // System.out.println("Total de palavras: " + wordCount);
        // System.out.println("Total de palavras distintas: " + wordCountDistinct);

        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i) + " " + freq.get(i));
        }

        // debug
        // System.out.println(words);
    }

    public static void main(String args[]){
        WordFrequency f = new WordFrequency();
    }
}