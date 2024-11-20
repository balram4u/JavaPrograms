package SwappingTwoNumber;

public class Sample1 {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swapping the values are .. "+a+ "  "+b);
        //Logic - Third Variable
        int temp=a;   //temp=10
         a=b;         //a=20
         b=temp;      //b=10

        System.out.println("After Swapping the values are .. "+a+ "  "+b);
    }
}
