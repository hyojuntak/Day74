package JC.Day74;

import java.util.ArrayList;
import java.util.Arrays;


 //버블정렬은 두수를 비교해서 큰수는 오른쪽 으로 이동시키는 방법을 이용한다. 작은수로부터 큰수로 순서 정렬
 //퀵정렬은 기준값을 찾고 기준값보다 작은 값들은 왼쪽, 작은 값은 오른쪽 (나누고 이동하고 의 반복 -> 재귀 사용)
 

public class Main {


    public static void main(String[] args) {
    
    //버블정렬
        // int [] n = {2,3,4,1,2};//5개

        // int temp = 0;
        
        // for (int i = 0; i < n.length-1; i++) {
        //     for (int j = i+1; j < n.length-1-i; j++) {
        //         if(n[j]>n[j+1]){
        //             temp = n[j];
        //             n[j] = n[j+1];
        //             n[j+1] = temp;

        //         }    
        //     }
            
        // }
        // System.out.println(Arrays.toString(n));
    

    //퀵정렬
        // int [] m = {2,3,4,1,2};//5개
      
        // Quick(m,0,m.length-1);
        // System.out.println(Arrays.toString(m));

    
    // static void Quick(int [] n, int start, int end){
    //     int mid = n[(start+end)/2];
    //     int left = start;
    //     int right = end;

    //     do {
    //         while((n[left]< mid) && (left <end)){
    //             left++;
    //         }
    //         while((mid< n[right]) && (right > start)){
    //             right--;
    //         }
    //         if(left<=right){
    //             int temp = n[left];
    //             n[left] = n[right];
    //             n[right] = temp;
    //             left++;right--;

    //         }


    //     } while (left<right);
    //         if(start<right){
    //             Quick(n, start, right);
    //         }
    //         if(left<end){
    //             Quick(n, left, end);
    //         }

    // }
    
    //삽입정렬
    // int [] m = {2,3,4,1,2};//5개
    // Insert(m);
    // System.out.println(Arrays.toString(m));

    //선택정렬
    int [] m = {2,3,4,1,2};//5개
    Select(m);
    System.out.println(Arrays.toString(m));


    }
    //선택정렬
    static void Select(int [] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = i+1; j < m.length; j++) {
                if(m[i]>m[j]){
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
    }


    //삽입정렬 
    // public static void Insert(int [] n){
    //     for (int i = 0; i < n.length; i++) {
    //         int temp = n[i];
    //         int j = i-1;

    //         while(j>=0 && n[j]>temp){
    //             n[j+1]=n[j];
    //             j--;
    //         }
    //         n[j+1] = temp;
            
    //     }
    // }
}
