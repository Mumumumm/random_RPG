import java.util.Scanner;

public class GameManager {
    public static final int GAMESTART = 1;
    public static final int EXIT = 2;
    public static final int NEWPLAYER = 1;
    public static final int SAVE = 2;
    public static final int SAVE_LOAD = 3;
    public static final int BACK = 4;

    CharacterManager charater = new CharacterManager();

    public void gameMenu() {
        System.out.println("===========================");
        System.out.println("1. 게임 시작");
        System.out.println("2. 게임 종료");
        System.out.println("===========================");
    }

    public void gameStart() {
        System.out.println("1. 캐릭터 생성후 시작");
        System.out.println("2. 저장하기");
        System.out.println("3. 저장 불러오기");
        System.out.println("4. 뒤로가기");

        while (true) {
            boolean flag = false;

            Scanner input = new Scanner(System.in);
            int selete = input.nextInt();

            switch (selete) {
                case NEWPLAYER:
                    System.out.println("캐릭터생성 후 시작됩니다");
                    System.out.println("=== 캐릭터 정보 ===");
                    System.out.println("HP : " + charater.getHp());
                    System.out.println("공격력 : " + charater.getStr());
                    System.out.println("방어력 : " + charater.getDef());
                    System.out.println("스피드 : " + charater.getSpeed());
                    System.out.println("치명률 : " + charater.getCritical() + "%");
                    System.out.println("===================");
                    System.out.println("1. 게임 시작하기");
                    System.out.println("2. 캐릭터 생성 나가기");
                    int playSelete = input.nextInt();
                    if(playSelete == 2){
                        gameStart();
                    }
                    break;
                case SAVE:
                    System.out.println("저장하시겠습니까?");
                    break;
                case SAVE_LOAD:
                    System.out.println("저장기록을 불러옵니다");
                    break;
                case BACK:
                    System.out.println("메인화면으로 이동합니다");
                    flag = true;
                    break;
            }
            if(flag){
                break;
            }
        }
        // 반복문 빠져나와 메인 화면 이동
        gameMenu();
    }
}


