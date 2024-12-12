package Day3.arrays;

public class powerOfNumberSmartWay {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(n<0) nn=nn*-1;
        while(nn>0){
            if(nn%2==0){
                nn=nn/2;
                x=x*x;
            }
            else{
                nn=nn-1;
                ans=ans*x;
            }
        }
        if(n<0) return (1/ans);
        else return ans;
    }
    public static void main(String[] args){
        System.out.println(new powerOfNumberSmartWay().myPow(2.1,3));
    }
}
