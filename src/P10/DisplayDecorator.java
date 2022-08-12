package P10;

public class DisplayDecorator extends Display {
    private Display decorDisplay;

    public DisplayDecorator(Display decorDisplay) {
        this.decorDisplay = decorDisplay;
    }

    public void Draw() {
        decorDisplay.Draw();
    }
}
