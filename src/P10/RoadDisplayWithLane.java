package P10;

public class RoadDisplayWithLane extends RoadDisplay {
    public void Draw() {
        super.Draw();
        DrawLine();
    }    

    private void DrawLine() {
        System.out.println("차선 표시");
    }
}
