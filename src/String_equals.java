import java.util.HashSet;
import java.util.Scanner;

public class String_equals {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc=sc.nextInt();
        while(tc-->0){
            ans();
        }
    }
    public static void ans(){
        int n = sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        String b = sc.nextLine();
String c ="";
        for (int i = 0; i <n ; i++) {
            if(a.charAt(i)!= b.charAt(i)){
             c+=b.charAt(i);
            }
        }
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i <c.length() ; i++) {
            hs.add(c.charAt(i));
        }
        System.out.println(hs.size());
    }
}
