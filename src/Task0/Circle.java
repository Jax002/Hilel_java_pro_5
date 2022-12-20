package Task0;

public class Circle implements Square{
    public Circle (float rad){
        this.rad=rad;
    }
    private float rad;
    @Override
    public float square_fig() {
        return (int) (3.14*2);
    }
}
