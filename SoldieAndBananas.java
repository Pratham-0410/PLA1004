import java.util.Scanner;

public class SoldieAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int s = 0;
        for(int i =1;i<=w;i++){
            s += i*k;
        }
        if(s>n){
            System.out.println(s-n);
        }else{
            System.out.println(0);
        }
        sc.close();
    }
    
}
