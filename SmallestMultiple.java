public class SmallestMultiple {
    public static void main(String[] args) {
        System.out.println(smallMultiple());
    }
    public static int smallMultiple(){
        int x=0;
        for (int i=1;i>0;i++){
            for(int j=1;j<21;j++){
                if (i%j>0){
                    break;
                }else if (j==20){
                    x=i;
                }
            }
            if (x>0){
                break;
            }
        }
        return x;

    }
}
