package progarm;

import java.util.Arrays;

public class Revarray {
    static void rotate(int[] a,int k){
        if(k>a.length)
            k=k%a.length;
    int[] a1=new int[a.length];
    for(int i=0;i<k;i++){
        a1[i]=a[a.length-k+i];
    }
    int j=0;
    for(int i=k;i<a.length;i++){
        a1[i]=a[j];
        j++;
    }
    System.arraycopy(a1,0,a,0,a.length);

    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        rotate(a,10);
        for (Integer i:a
             ) {
            System.out.print(i+" ");

        }
    }
}
