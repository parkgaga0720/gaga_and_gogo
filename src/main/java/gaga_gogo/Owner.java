package gaga_gogo;

public class Owner {

    private final Dog gogo = new Dog();

    public void gogoSit() {
        if (gogo.isStanding()) {
            gogo.sitting();
        }else if(gogo.isSitting() || gogo.isWaiting() || gogo.isEating()) {
            System.out.println("고고는 이미 앉아 있습니다.");
        }else{
            System.out.println("산책 중에는 바닥이 더러워서 앉을 수 없습니다.");
        }
    }

    public void gogoWait() {
        gogo.waiting();
    }

    public void gogoEat() {
        gogo.eating();
    }

    public void gogoWalk() {
        gogo.happy();
    }

    public void gogoRun() {
        gogo.running();
    }

    public void gogoHome() {
        gogo.sad();
    }
}
