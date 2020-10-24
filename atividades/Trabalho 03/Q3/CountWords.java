import java.util.Scanner;
import java.util.ArrayList;

public class CountWords{
    int wordCount = 0;
    int wordCountDistinct = 0;
    Scanner in;
    String line;

    public CountWords(){
        in = new Scanner(System.in);
        line = in.nextLine();
        line += " ";

        this.count();

        in.close();
    }

    public void count(){
        String auxWord = new String();
        ArrayList<String> words = new ArrayList();
        boolean repeated = false;

        for(char c : line.toCharArray()){
            if(c != ' '){
                auxWord += c;
            } else {
                // debug
                // System.out.println(auxWord);
                wordCount++;
                repeated = false;

                for(String s : words){
                    if(s.equals(auxWord)) repeated = true;
                }

                if(!repeated){
                    wordCountDistinct++;
                    words.add(auxWord);
                }

                auxWord = new String();
            }
        }

        System.out.println("Total de palavras: " + wordCount);
        System.out.println("Total de palavras distintas: " + wordCountDistinct);
        
        // debug
        // System.out.println(words);
    }

    public static void main(String args[]){
        CountWords c = new CountWords();
    }
}