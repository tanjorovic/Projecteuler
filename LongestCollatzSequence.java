class LongestCollatzSequence {
    public static void main(String[] args) {
        int x=0;
        long y=0;
        for (long i=1;i<1000000;i++){
            if (collatzTerms(i)>x){
                x=collatzTerms(i);
                y=i;
            }
        }
        System.out.println("number "+y+" has "+x);
        
        
    }
    public static int collatzTerms(long number){
        int count =0;
        while (true){
            if (number%2==0){
                count++;
                number/=2;
            }else if (number == 1){
                count ++;
                break;
            }else {
                count ++;
                number= (3*number)+1;
            }
        }
        return count;
    }
}
