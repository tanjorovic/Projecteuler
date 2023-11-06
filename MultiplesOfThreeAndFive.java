
import java.util.Scanner;

public class MultiplesOfThreeAndFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int number = sc.nextInt();
        
        System.out.println(sum(number));

    }
    
    public static int sum(int number){
        int sum=0;
        for (int i=0;i<number;i++){
            if (i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
    
}