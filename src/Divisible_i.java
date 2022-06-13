import java.util.ArrayList;
import java.util.Scanner;

public class Divisible_i {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc= sc.nextInt();
        while(tc-->0)ans();

    }
    public static void ans(){
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(i,0);
        }

        int k1=n;
        int k2=1;
        for(int i=n-1;i>=0;i--){
            if(i%2==0){
                al.set(i,k1--);
            }
            else if(i%2!=0){
                al.set(i,k2++);
            }
        }
        al.forEach(i-> System.out.print(i+" "));
        al.clear();
        System.out.println();
    }
}
