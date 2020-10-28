import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

 

 

class Main {

  public static void main(String[] args) {

    

    int g = 0;  //결과값 2번 출력하기 위해 

    while(g<2)   {

        Scanner sc = new Scanner(System.in);  // 입력 받기 위한 Scanner 객체 생성

 

        Map<Integer,Integer> map = new HashMap<>();  //한줄에 두 개를 입력받기 위해 Map으로 받음

        

 

        int N = 0; int M = 0;             //N,M 초기화

        map.put(N = sc.nextInt(),M = sc.nextInt());   //N,M을 각각 Key,value값으로 map에 넣는다.

        int [] arr = new int [N];   //방의 크기 N만한 배열 생성

 

        for (int i = 0; i < N; i++) {   //N을 돌면서

            int e =sc.nextInt();     //N의 개수 만큼 입력받음

            arr[i]=e;                //arr에 저장

        }

        int count = 0;              //결과값 출력 위한 count 변수 생성 및 초기화

        for (int i = 0; i < arr.length; i++) {     //배열만큼 돌면서

            for (int j = i+1; j < arr.length; j++) {     //선택정렬 해줌

                if(arr[i]!=arr[j]) {count+=1;}      //만약 같지 않다면 count+=1해줌 

            }

        

        }

        System.out.println(count);  //결과값 count 출력 

    g++;

    }

  }

}
