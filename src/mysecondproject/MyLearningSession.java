package mysecondproject;

import java.sql.SQLOutput;

public class MyLearningSession {
    public void mobile(double noOfMobiles) {
        double mobilePrice = 5000;
        double totalPrice = mobilePrice*noOfMobiles;
        if(noOfMobiles>10){
            double x = 10/100;
            double y = x*totalPrice;
            System.out.println(y);
        }
//        int iphone = 25*1000;
//        int nokia = 8*2000;
//        int mi = 28*5000;
//        int onePlus = 2*3000;

    }

    public static void main(String[] args) {
        MyLearningSession ml = new MyLearningSession();
        ml.mobile(25);
        ml.mobile(8);
        ml.mobile(28);
        ml.mobile(2);
    }


}
class OverloadingCheck{

    public void overR1(){
        System.out.printf("osman");
    }

    public void overR1(String s1){
        System.out.printf("mehboob");
    }

    public void overR1(String s1, int i){
        System.out.println(s1+i);
        System.out.printf("razi");

    }

    public static void main(String[] args) {
        OverloadingCheck or = new OverloadingCheck();
        or.overR1("cccc",5);
    }

}