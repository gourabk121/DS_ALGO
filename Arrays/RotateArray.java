import java.io.*;
import java.util.*;

public class RotateArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a, int si, int li){
      while(li>si){
          int temp=a[li];
          a[li]=a[si];
          a[si]=temp;
          li--;
          si++;
          
      }
  }

  public static void rotate(int[] a, int k){
    // write your code 
    int n=a.length;
    if(k>=0){
        k=k%n;
    }else{
        k=(k%n)+5;
    }
    // System.out.println(k);

    reverse(a, 0, n-k-1);
    reverse(a, n-k, n-1);
    reverse(a, 0, n-1);

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
