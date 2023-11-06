
import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("to what number you want feb to go:");
    int number = sc.nextInt();
     
    System.out.println(sum(number));
  }
  public static int sum(int number){
    int sum=0;
    int x=1;
    int y=2;
    while (y<=number){
        if (y%2==0 ){
                sum+=y;
        }
        int z=y;
        y+=x;
        x=z;
        
    }
    return sum;
  }
}
