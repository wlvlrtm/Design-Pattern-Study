package P7;

public class Off implements State {
    private static Off off = new Off();
    

    private Off() {
    }

    public static Off getInstance() {
        return off;
    }

    public void onButtonPushed(Light light) {
        light.setState(On.getInstance());
        System.out.println("형광등 꺼짐");
    }

    public void offButtonPushed(Light light) {
        System.out.println("반응 없음");
    }
}
