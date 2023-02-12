import java.util.Scanner;
import java.util.Arrays;

public class CuSu {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

       int N=sc.nextInt();

        int[] arr = new int[N];

         for(int i=0;i<=N;i++)
          {
            arr[i]=sc.nextInt();

           }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }


        System.out.println("Cumulative Sum: " + Arrays.toString(arr));
    }
}