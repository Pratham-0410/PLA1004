import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int cutoff = arr[k - 1];

        for(int i = 0; i<arr.length;i++){
            if(arr[i] >= cutoff && arr[i] > 0){
                count+=1;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
