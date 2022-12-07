package exer.exer2;

public class TestBird {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        Bird penguin = new Penguin();
        Bird swan = new Swan();
        Chicken chicken = new Chicken();

        birds[0] = penguin;
        birds[1] = swan;
        birds[2] = chicken;

        for (int i = 0; i < birds.length; i++) {
            birds[i].eat();
            if(birds[i] instanceof Flyable){
                ((Flyable)birds[i]).fly();
            }

            if(birds[i] instanceof Swimming){
                ((Swimming) birds[i]).swim();
            }
        }
    }
}
