package core_java;

public class WhileFor {
    public static void main(String[] args) {

        int over = 1;

        while (over <= 6) {

            for (int ball = 1; ball <= 6; ball++) {
                System.out.println("Over :" + over +" "+ " Ball :" + ball);
            }

            over++;
        }
    }
}


