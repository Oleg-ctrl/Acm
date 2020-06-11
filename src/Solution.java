import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String arr1[] = new String[n];
        if (n <= 100)
        {
            n = n;
        }
        else
        {
            n = 100;
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.next();
        }
        ArrayList arrayList = new ArrayList();

        Pattern p = Pattern.compile("[aeuioy]{3}");

        for (int i = 0; i < arr1.length; i++) {
            Matcher m = p.matcher(arr1[i]);
            if (m.find()) {
                arrayList.add(arr1[i]);
            }

        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

