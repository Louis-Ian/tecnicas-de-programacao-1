import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class WordFrequency2{
    int wordCount = 0;
    int wordCountDistinct = 0;
    Scanner in;
    String line;

    public WordFrequency2(){
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

        ArrayList<String> wordsAux = new ArrayList<String>(words);
        Collections.sort(wordsAux);
        
        ArrayList<Integer> freqAux = new ArrayList();
        for(String w : words){
            freqAux.add(0);
        }

        for(int i = 0; i < wordsAux.size(); i++){
            for(int j = 0; j < words.size(); j++){
                if(wordsAux.get(i).equals(words.get(j))){
                    freqAux.set(i, freq.get(j));
                    System.out.println(wordsAux.get(i) + " " + freqAux.get(i));
                }
            }
        }
            
    }

    public static void main(String args[]){
        WordFrequency2 f = new WordFrequency2();
    }
}