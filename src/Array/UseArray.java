package Array;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        int [] numberList = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter numbers: ");

        for (int i=5; i<numberList.length; i++){
            numberList[i]=sc.nextInt();
        }

        for(int i=0; i<numberList.length; i++) {
            System.out.println(numberList[i]);
        }
        sc.close();

    }
}
