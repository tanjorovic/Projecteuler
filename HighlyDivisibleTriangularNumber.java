public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        long first=0;
        for (long i=1;i>0;i++){
            if(factors(triangleNumber(i))>=500){
                first = triangleNumber(i);
                break;
            }
        }
        System.out.println(first);
    }
    public static long triangleNumber(long x){
        int number=0;
        for (int i=0;i<=x;i++){
            number +=(long)i;
        }
        return number;
    }
    public static int factors(long x){
        int number =0;
        for (int i=1;i<=x;i++){
            if (x%i==0){
                number+=1;
            }
        }
        return number;
    }
}
