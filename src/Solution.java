import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = abs (scanner.nextInt());
        }

        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = Math.abs(scanner.nextInt());
        }
        ArrayList <Integer> array = new ArrayList();

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    array.add(arr1[i]);
                    break;
                }
            }
        }
        if (array.size() == 0) {
            System.out.println(0);
            System.out.println();
        } else {
            System.out.println(array.size());
            for (int i = 0; i < array.size(); i++) {
                System.out.print(array.get(i));
                System.out.println("");
            }

        }

    }
}

