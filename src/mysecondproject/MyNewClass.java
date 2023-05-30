package mysecondproject;

public class MyNewClass {
    int mehboob = 32;
    public void razi() {
        System.out.println("He is a QA");
    }
    public void ata(int x) {
        System.out.println(x);
    }

    //default constructor
//    public MyNewClass () {
//
//    }


    // String razi = "testing eng";
    //parametrise constructor
    MyNewClass (String razi) {
        System.out.println(razi);
    }

    public MyNewClass(){
        System.out.println("no arg constructor no need to define in main method");
    }

    public static void main(String[] args) {
        MyNewClass mn = new MyNewClass();
        MyNewClass mc = new MyNewClass("testing eng");
        mn.razi();
        mc.ata(5);
    }
}
