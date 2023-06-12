import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 42; // プログラマが設定した数

        System.out.println("数当てゲームを開始します。2桁の正の整数を予想して入力してください。");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0; // 入力回数のカウンタ

        while (attempts < 5) {
            System.out.print("予想した数: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                if (Math.abs(guess - targetNumber) >= 20) {
                    System.out.println("20以上差があります。");
                } else {
                    if (guess > targetNumber) {
                        System.out.println("設定された数より大きいです。");
                    } else {
                        System.out.println("設定された数より小さいです。");
                    }
                }
            }

            attempts++;
        }

        if (attempts == 5) {
            System.out.println("ゲームオーバー。正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}
