package P5;

public abstract class Robot {
    private String name; 
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;


    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        this.attackStrategy.attack();
    }

    public void move() {
        this.movingStrategy.move();
    }
}