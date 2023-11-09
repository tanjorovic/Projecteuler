class SummationOfPrimes{
    public static void main(String[] args) {
        System.out.println(sumPrime(2000000));
    }
    public static boolean prime(int number){
        if (number == 2||number ==3){
            return true;
        }
        for (int i=2;i<=(int)(number/2);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static long sumPrime(int x){
        long sum=0;
        for (int i=2;i<x;i++){
            if (prime(i)){
                sum+=(long)i;
            }
        }
        return sum;
    }
}
