import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testNum = 1;
        for (int i = 0; i < testNum; i++) {
            int eachClassNum = 3;

            for (int j = 0; j < eachClassNum; j++) {
                long sum = 0, avg = 0;
                ArrayList<Integer> scores = new ArrayList<Integer>();
                scores.add(sc.nextInt());
                System.out.println(scores);

            }
        }
    }

}

// testNum C

// for문 (C번 반복)

// [이번 회차의 학생수 n이 있다.
// for(n번 인수 받고) 배열로 만들어서
// 배열의 평균 내고
// 평균보다 낮은 인수 죽여버림

// 남은 인수/원래 전체 인수(N)

// 해서 print(소수점 셋째자리까지)

// ]