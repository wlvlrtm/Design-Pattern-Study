package P7;

public class Light {
    private State state;


    public Light() {
        //this.state = new Off();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void onButtonPushed() {
        this.state.onButtonPushed(this);
    }

    public void offButtonPushed() {
        this.state.offButtonPushed(this);
    }
}
