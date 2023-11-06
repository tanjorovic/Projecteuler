import java.util.*;

public class  LargestPrimeFactor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a positive number:");
        long number= sc.nextLong();
        System.out.println(largestFactor(number));
    }
    public static long largestFactor(long number){
            for (int i=1;i<(long)(number/2);i++){
                if (number%i==0){
                    number/=i;
                    i=1;
                }
        }
        return number;
    }
}