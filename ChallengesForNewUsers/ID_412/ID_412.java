import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ID_412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (String item : fizzBuzz(n)) {
            System.out.println(item);
        }
    }

    public static List<String> fizzBuzz(int n) {
        int index = 1;
        List<String> result = new ArrayList<>();
        while (index <= n) {
            result.add(getFizz(index++));
        }
        return result;
    }

    public static String getFizz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        else if (n % 3 == 0)    return "Fizz";
        else if (n % 5 == 0)    return "Buzz";
        else return Integer.toString(n);
    }
}
