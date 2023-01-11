import java.util.*;

public class Testowy4_1_PowtKolekcji {
    public static void main(String[] args) throws java.lang.Exception {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        System.out.println("");

        for (String temp : companies) {

            System.out.print(temp);
            if (companies.get(companies.size()-1) != temp) {
                System.out.print(", ");
            }

        }


        System.out.println("");



    }
}
