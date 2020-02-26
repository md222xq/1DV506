package Test_package;

import java.util.Scanner;

public class triangleee {
    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {
            for (int s = i; s <= 10; s++) {
                System.out.print(" ");
            }

            for (int x = 0; x < i * 2 - 1; x++) {
                System.out.print("X");
            }

            System.out.println();

        }

        int x = 5;
        int y = 8;

        System.out.println(Math.min(x, y));

        Scanner sc = new Scanner(System.in);
        System.out.print("Provide an integer 3 or higher : ");
        int sz = sc.nextInt();
        sc.close();

        if (sz < 3) {
            System.err.print("Wrong number");
        } else {
            String stars = " ";
            for (int i = 0; i < sz; i++) {
                stars = stars + "*";
            }
            String space = "*";

            for (int j = 0; j < sz - 2; j++) {
                space = space + " ";

            }
            space = space + "*";

            System.out.println("\n" + stars);

            for (int i = 0; i < sz - 2; i++) {
                System.out.println(space);
            }
            System.out.println(stars);


        }
    }

}
