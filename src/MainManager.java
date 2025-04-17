import java.util.Scanner;

public class MainManager {
    GameManager play = new GameManager();

    public void run() {
        Scanner input = new Scanner(System.in);
        play.gameMenu();
        while (true) {
            boolean flag = false;
            int select = input.nextInt();
            switch (select) {
                case GameManager.GAMESTART:
                    System.out.println("게임실행");
                    play.gameStart();
                    break;
                case GameManager.EXIT:
                    System.out.println("실행 종료");
                    flag = true;
                    break;
            }
            if (flag) {
                break;
            }

        }
    }
}


