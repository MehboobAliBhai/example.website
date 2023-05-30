package inheritance;

import java.sql.SQLOutput;

public class MainInheritance {
    public static void main(String[] args) {
        ActivaPremium ap = new ActivaPremium();
        ap.handle = "Short";
        System.out.println(ap.handle);
    }
}