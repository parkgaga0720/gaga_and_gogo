package gaga_gogo;

public class Cat extends Pet {

    @Override
    public void sit() {
        System.out.println("나나는 앉고 싶을 때 앉습니다.");
    }

    @Override
    public void waitNow() {
        System.out.println("나나는 말을 듣지 않습니다.");
    }

    @Override
    public void eat() {
        System.out.println("나나가 츄르를 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println("나나는 집에서 자는걸 더 좋아합니다.");
    }

    @Override
    public void run() {
        System.out.println("나나가 집에서 우다다 뛰어 다닙니다.");
    }

    @Override
    public void goHome() {
        System.out.println("나나는 영역동물이라 항상 집에 있습니다.");
    }
}
