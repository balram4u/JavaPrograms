package SwappingTwoNumber;

public class Sample5 {
    public static void main(String[] args) {

        int a=10,b=20;
        System.out.println("Before Swapping the values are .. "+a+ "  "+b);
        b= a+b-(a=b);
        System.out.println("After Swapping the values are .. "+a+ "  "+b);
    }
}
