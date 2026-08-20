import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;

        if(x<=5){
            count +=1;
        }else{
            if(x%5==0){
                count = x/5;
            }else{
                count = x/5 +1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
