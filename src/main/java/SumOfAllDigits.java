import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Integer total = Stream.of(String.valueOf(number).split(""))
                .collect(Collectors.summingInt(Integer::parseInt)).intValue();
        System.out.print(total);
        scanner.close();
    }
}