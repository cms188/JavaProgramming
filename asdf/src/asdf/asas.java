package asdf;

import java.util.Scanner;
import java.util.Random;

public class asas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1부터 100 사이의 랜덤 정수 생성
        int secretNumber = random.nextInt(100) + 1;

        // 시도 횟수 초기화
        int attempts = 0;

        while (true) {
            System.out.print("1부터 100 사이의 정수를 추측해보세요: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("정답입니다! 시도 횟수 = " + attempts);
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("제시한 정수가 낮습니다.");
            } else {
                System.out.println("제시한 정수가 높습니다.");
            }
        }

        scanner.close();
    }
}
