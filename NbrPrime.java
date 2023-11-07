class NbrPrime {
    public static void main(String[] args) {
        System.out.println(nPrime(10001));
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
    public static int nPrime(int number){
        int count =2;
        int x=0;
        for (int i=4;i>0;i++){
            if (prime(i)){
                count ++;
            }
            if (count==number){
                x=i;
                break;
            }
            
        }
        return x;
    }
}
