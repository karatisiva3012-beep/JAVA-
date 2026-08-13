package core_java;

public class ForWhile {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            int j = 1;

            while (j <= 5) {
                System.out.printf("%3d", i - j);
                j++;
            }

            System.out.println();
        }
    }
}


