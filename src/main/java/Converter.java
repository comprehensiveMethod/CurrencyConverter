import java.net.MalformedURLException;

public class Converter {
    private final CurrencyObject currencyObject = new CurrencyObject();

    public Converter() throws MalformedURLException {
    }

    public Double convert(String firstCurrency, int quantity, String secondCurrency){
        if(firstCurrency.equals("USD")&&currencyObject.getValue(secondCurrency)!=null){
            return currencyObject.getValue(secondCurrency)*quantity;
        }
        else if(currencyObject.getValue(secondCurrency)!=null&&currencyObject.getValue(firstCurrency)!=null){
            return currencyObject.getValue(secondCurrency)/currencyObject.getValue(firstCurrency)*(double)quantity;
        }else throw new IllegalArgumentException("Wrong currency key");
    }
}
