import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllDigits {

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int testCases = Integer.parseInt(bufferedReader.readLine());
        final String[] inputs = bufferedReader.readLine().split(" ");
        IntStream.range(0, testCases).forEach(i ->
                System.out.println(Stream.of(inputs[i].split(""))
                            .mapToInt(Integer::parseInt).sum())
        );
    }
}