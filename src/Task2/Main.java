package Task2;
import java.security.SecureRandom;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        IntStream numbers = sr
                .ints(50L, 1, 999);
         numbers.filter((x) -> {
            return x % 2 == 1;
        }).sorted().forEach(System.out::println);

    }
}
