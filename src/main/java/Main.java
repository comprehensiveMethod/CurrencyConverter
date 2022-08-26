import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Converter converter = new Converter();

        System.out.println("Enter first value(like USD, EUR, RUB...)");
        String firstCurrency = new Scanner(System.in).nextLine();
        System.out.println("Enter amount of "+firstCurrency);
        Integer quantity = new Scanner(System.in).nextInt();
        System.out.println("Enter second value(like USD, EUR, RUB...)");
        String secondCurrency = new Scanner(System.in).nextLine();

        System.out.println(converter.convert(firstCurrency,quantity,secondCurrency));
    }
}
