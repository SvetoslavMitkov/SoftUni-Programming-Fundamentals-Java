package Lists;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            productList.add(scanner.nextLine());
        }
        Collections.sort(productList);
        int count = 1;
        for (String product: productList) {
            System.out.print(count + ".");
            System.out.println(product);
            count++;
        }
    }
}
