package P10;

public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decorDisplay) {
        super(decorDisplay);
    }

    public void Draw() {
        super.Draw();
        DrawLine();
    }

    private void DrawLine() {
        System.out.println("차선 표시");
    }
}
