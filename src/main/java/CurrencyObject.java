import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CurrencyObject {
    private final URL url = new URL("https://cdn.cur.su/api/cbr.json");
    private Map<String, Double> currencyAndValue;
    public CurrencyObject() throws MalformedURLException {
        try {
            Map<String, Map> fullJson;
            fullJson = new ObjectMapper().readValue(url, HashMap.class);
            currencyAndValue = fullJson.get("rates");
            currencyAndValue.remove("USD");
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
    public Double getValue(String key){
        return currencyAndValue.get(key);
    }

}
