package P7;

public class On implements State {
    private static On on = new On();
    

    private On() {
    }

    public static On getInstance() {
        return on;
    }

    public void onButtonPushed(Light light) {
        System.out.println("반응 없음");
    }

    public void offButtonPushed(Light light) {
        light.setState(Off.getInstance());
        System.out.println("형광등 꺼짐");
    }
}
