package P5;

public class Main {
    public static void main(String[] args) {
        Robot atom = new Atom("atom");
        Robot taekwonV = new TaekwonV("TaekwonV");

        System.out.println(atom.getName());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());
        atom.move();
        atom.attack();

        System.out.println();

        System.out.println(taekwonV.getName());
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());
        taekwonV.move();
        taekwonV.attack();
    }
}
