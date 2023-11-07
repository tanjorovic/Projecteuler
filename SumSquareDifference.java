class SumSquareDiffrence {
    public static void main(String[] args) {
        System.out.println(squareOfTheSums(100)-sumOfTheSquares(100));
        
    }
    public static int sumOfTheSquares(int number){
        int sum=0;
        for (int i=1;i<=number;i++){
            sum+=Math.pow(i,2);
        }
        return sum;
    }
    public static int squareOfTheSums(int number){
        int sum=0;
        for (int i=1;i<=number;i++){
            sum+=i;
        }
        
        return (int)Math.pow(sum,2);
    }
}