package P10;

public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(DisplayDecorator decorDisplay) {
        super(decorDisplay);
    }

    public void Draw() {
        super.Draw();
        DrawTraffic();
    }

    private void DrawTraffic() {
        System.out.println("교통량 표시");
    }
}
