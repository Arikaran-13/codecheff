import java.util.Scanner;

public class Subscription {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = sc.nextInt();
        while(tc-->0){
            ans();
        }
    }
    public static void ans(){
        int n = sc.nextInt();
        int samt=sc.nextInt();
        int ans;

        if(n<=6){
            System.out.println(samt);
        }
        else if(n%6==0){

             ans = (n/6)*samt;
            System.out.println(ans);
        }
        else if(n%6!=0){
            ans= (n/6)*samt;
            ans=ans+samt;
            System.out.println(ans);
        }

    }
}
