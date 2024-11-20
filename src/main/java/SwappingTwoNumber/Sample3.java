package SwappingTwoNumber;

public class Sample3 {
    public static void main(String[] args) {
       //this logic will not be applicable with 0 numbers
        int a=10,b=20;
        System.out.println("Before Swapping the values are .. "+a+ "  "+b);
        a=a*b;  //a=200
        b=a/b;  //b=10
        a=a/b; //a=20
        System.out.println("After Swapping the values are .. "+a+ "  "+b);
    }
}
