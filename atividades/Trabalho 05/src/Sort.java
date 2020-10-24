import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("RandomGauss.txt");
        String file = Files.readString(p);

        String[] words = file.split(" |\n");

        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
                numbers.add(Double.valueOf(words[i]));
            }
        }

        Collections.sort(numbers);

        FileWriter f = new FileWriter("RandomGauss.txt");

        for (int i = 0; i < numbers.size(); i++){
            f.write(String.valueOf(numbers.get(i)));
            f.write("\n");
        }

        f.close();
    }
}
