import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllDigitsTestCases {

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final Integer testCases = Integer.parseInt(bufferedReader.readLine());
        IntStream.range(0, testCases).forEach(i -> {
            Integer number = 0;
            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Integer total = Stream.of(String.valueOf(number).split(""))
                    .collect(Collectors.summingInt(Integer::parseInt)).intValue();
            System.out.println(total);
        });
    }
}