class SpecialPythagoreanTriples {
    public static void main(String[] args) {
        for (int i=1;i<300;i++){
            for (int j=1;j<500;j++){
                for (int k=1;k<500;k++){
                    if (pethagorean(i,j,k) && i+j+k==1000 ){
                        System.out.println(i*j*k);
                        break;
                    }
                }
            }
        }
    }
    public static boolean pethagorean(int x,int y,int z){
        if (Math.pow(x,2)+Math.pow(y,2)==Math.pow(z,2)){
            return true;
        }else {
            return false;
        }
    }
}
