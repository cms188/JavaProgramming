package asdf;

import java.util.Scanner;

public class Asdfgh {
    // 좌석 개수를 상수로 선언
    private static final int NUM_SEATS = 10;

    public static void main(String[] args) {
        // 좌석 배열 초기화
        int[] seats = new int[NUM_SEATS];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 좌석 예약 상태 출력
            System.out.println("좌석 배치표:");
            System.out.println("===========================");
            System.out.println("1 2 3 4 5 6 7 8 9 10 ");
            System.out.println("===========================");
            for (int i = 0; i < NUM_SEATS; i++) {
                if (seats[i] == 0) {
                	
                    System.out.print("O "); // 예약 가능한 좌석
                } else {
                    System.out.print("1 "); // 예약된 좌석
                }
            }
            System.out.println();
            System.out.println("===========================");
            System.out.println();

            // 사용자로부터 좌석 번호 입력 받기
            System.out.print("예약할 좌석 번호를 입력하세요 (1-" + NUM_SEATS + ", 음수 입력 시 종료): ");
            int seatNumber = scanner.nextInt();

            // 음수가 입력되면 프로그램 종료
            if (seatNumber < 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 좌석 번호가 범위를 벗어나면 오류 메시지 출력
            if (seatNumber < 1 || seatNumber > NUM_SEATS) {
                System.out.println("잘못된 좌석 번호입니다. 1부터 " + NUM_SEATS + " 사이의 값을 입력하세요.");
                continue;
            }

            // 좌석이 이미 예약된 경우
            if (seats[seatNumber - 1] == 1) {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
            } else {
                // 좌석 예약 처리
                seats[seatNumber - 1] = 1;
                System.out.println(seatNumber + "번 좌석이 예약되었습니다.");
            }
        }

        scanner.close();
    }
}
