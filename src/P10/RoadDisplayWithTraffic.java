package P10;

public class RoadDisplayWithTraffic extends RoadDisplay {
    public void Draw() {
        super.Draw();
        DrawTraffic();
    }

    private void DrawTraffic() {
        System.out.println("교통량 표시");
    }
}
