import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

class  Pogoda {
    public static String temp(String city){
        try{
            Document doc = Jsoup.connect("https://www.google.com/search?q=погода+" + city).get();
            Elements elem = doc.select("#wob_tm");
            String temperatura = elem.text();
            return temperatura;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String pogoda(String city){
        try{
            Document doc = Jsoup.connect("https://www.google.com/search?q=погода+"+ city).get();
            Elements elem = doc.select("#wob_tci");
            String pogoda = elem.attr("alt");
            return pogoda;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
