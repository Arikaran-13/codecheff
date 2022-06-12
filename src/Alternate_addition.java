import java.util.Scanner;

public class Alternate_addition {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc= sc.nextInt();
        while(tc-->0)ans();

    }
    public static void ans(){
        int a=sc.nextInt();
        int b= sc.nextInt();

        if(a%2==0 && b%2!=0){
            System.out.println("Yes");
        }
        else{

        }
    }
}
