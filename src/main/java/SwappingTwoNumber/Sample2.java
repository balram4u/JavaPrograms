package SwappingTwoNumber;

public class Sample2 {
    public static void main(String[] args) {
        //Here we are not going to use third variable
        int a =10 ,b=20;
        System.out.println("Before Swapping the values are .. "+a+ "  "+b);
        a=a+b;   //a=30
        b=a-b;   //b=30-20 =10
        a=a-b;   //a=30-10=20
        System.out.println("After Swapping the values are .. "+a+ "  "+b);
    }
}
