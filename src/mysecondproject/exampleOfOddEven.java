package mysecondproject;

public class exampleOfOddEven {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
