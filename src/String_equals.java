import java.util.*;

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
        ArrayList<String>al = new ArrayList<String>();
        for (int i = 0; i <n ; i++) {
            if(a.charAt(i)!= b.charAt(i)){
            al.add(b.charAt(i)+"");
            }
        }

        System.out.println(al.stream().distinct().count());


    }
}
