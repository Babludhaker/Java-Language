package CollectionsAndGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("Bangladesh","Dhaka");
        countryMap.put("Shrilanka","Columobo");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Country Name: ");
        String country = input.next();

        if(countryMap.containsKey(country)){
            System.out.printf("Your Country Name %s and Your Country Capital is %s", country,countryMap.get(country));
        } else {
            System.out.printf("Sorry We don't now this Capital %s",country);
        }
    }
}
