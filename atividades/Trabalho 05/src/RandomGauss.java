import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.io.*;

public final class RandomGauss {
    public static void main(String[] args) throws IOException {
        RandomGauss gaussian = new RandomGauss();
        double MEAN = 100.0f;
        double VARIANCE = 5.0f;

        FileWriter out = new FileWriter("RandomGauss.txt", true);

        for (int idx = 1; idx <= 10; ++idx) {
            log(out, "Generated: " + gaussian.getGaussian(MEAN, VARIANCE) + "\n");
        }

        Path p = Path.of("RandomGauss.txt");
        gaussian.readLog(p);

        out.close();
    }

    private Random fRandom = new Random();

    public double getGaussian(double aMean, double aVariance) {
        return aMean + fRandom.nextGaussian() * aVariance;
    }

    private static void log(FileWriter f, Object aMsg) throws IOException {
        f.write(String.valueOf(aMsg));
    }

    private static void readLog(Path p) throws IOException {
        String s = Files.readString(p);
        System.out.println(s);
    }
}