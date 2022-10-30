import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        System.out.println("Погода в городе " + city + ": " + Pogoda.pogoda(city) + " " + Pogoda.temp(city) + " °C");

    }
}
