package gaga_gogo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        System.out.println("교육하고 싶은 반려 동물을 선택하세요:");
        System.out.println("1. 고고(강아지)");
        System.out.println("2. 나나(고양이)");
        System.out.print("번호 선택: ");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                pet = new Dog();
                break;
            case 2:
                pet = new Cat();
                break;
            default:
                System.out.println("우리집에는 고고와 나나만 있습니다!");
                return;
        }

        Owner gaga = new Owner(pet);

        while (true) {
            System.out.println("======= 고고와 나나 교육 프로그램 =======");
            System.out.println("1. 앉아");
            System.out.println("2. 기다려");
            System.out.println("3. 먹어");
            System.out.println("4. 산책 가자");
            System.out.println("5. 뛰어");
            System.out.println("6. 집에 가자");
            System.out.println("0. 교육 종료");
            System.out.print("교육 선택 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    gaga.sit();
                    break;
                case 2:
                    gaga.waitNow();
                    break;
                case 3:
                    gaga.eat();
                    break;
                case 4:
                    gaga.walk();
                    break;
                case 5:
                    gaga.run();
                    break;
                case 6:
                    gaga.goHome();
                    break;
                case 0:
                    System.out.println("애들아 고생했어~");
                    return;
                default:
                    System.out.println("아직 배우지 못한 교육입니다.");
                    break;
            }

        }
    }
}
