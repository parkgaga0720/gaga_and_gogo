package gaga_gogo;

public class Owner {
    private final Pet pet;

    public Owner(Pet pet) {
        this.pet = pet;
    }

    public void sit()     { pet.sit(); }
    public void waitNow()    { pet.waitNow(); }
    public void eat()     { pet.eat(); }
    public void walk()    { pet.walk(); }
    public void run()     { pet.run(); }
    public void goHome()    { pet.goHome(); }
}
