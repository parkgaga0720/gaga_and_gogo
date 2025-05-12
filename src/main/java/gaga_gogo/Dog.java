package gaga_gogo;

public class Dog extends Pet {
    private String state = "Standing";
    private int speed = 0;

    @Override
    public void sit() {
        if (state.equals("Sitting")) {
            System.out.println("고고는 이미 앉아있습니다.");
        } else {
            state = "Sitting";
            System.out.println("고고가 앉아서 쳐다봅니다");
        }
    }

    @Override
    public void waitNow() {
        if (state.equals("Sitting")) {
            state = "Waiting";
            System.out.println("고고가 기다리고 있습니다.");
        } else {
            System.out.println("고고는 먼저 앉아야 기다릴 수 있습니다.");
        }
    }

    @Override
    public void eat() {
        if (state.equals("Waiting")) {
            state = "Eating";
            System.out.println("고고가 칭찬으로 간식을 먹습니다.");
        } else {
            System.out.println("고고에게 간식을 줄 수 없습니다.");
        }
    }

    @Override
    public void walk() {
        if (state.equals("Sitting") || state.equals("Waiting") || state.equals("Eating")) {
            state = "Walking";
            speed = 1;
            System.out.println("고고가 산책을 나와서 신났습니다!");
        } else {
            System.out.println("고고는 집에서 다른 교육을 먼저 해야 합니다.");
        }
    }

    @Override
    public void run() {
        if (state.equals("Walking") || state.equals("Running")) {
            state = "Running";
            speed++;
            System.out.println("고고가 신나게 뛰고 있습니다! 속도: " + speed);
        } else {
            System.out.println("집에서 뛰면 엄마한테 혼납니다.");
        }
    }

    @Override
    public void goHome() {
        if (state.equals("Walking") || state.equals("Running")) {
            state = "Standing";
            speed = 0;
            System.out.println("고고가 집에 돌아와서 시무룩해합니다.");
        } else {
            System.out.println("고고는 이미 집에 있습니다.");
        }
    }
}
