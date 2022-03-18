package 일차원배열;

import java.util.Scanner;

// 10818 : 최소, 최대
public class 최소최대 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int integer = sc.nextInt();

            if(min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
        }
        sb.append(min);
        sb.append(" ");
        sb.append(max);

        System.out.println(sb);
    }
}
