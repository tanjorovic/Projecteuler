import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("to what number you want feb to go:");
    int number = sc.nextInt();
     
    System.out.println(sum(number));
  }
  public static int sum(int number){
    int sum=1;
    int x=1;
    int y=2;
    while (true){
        int z=y;
        y+=x;
        x=z;
        if (y>=number){
            break;
        }
        if (y%2==0 ){
                continue;
            }else {
                 sum+=y;
              }
        
    }
    return sum;
  }
}
