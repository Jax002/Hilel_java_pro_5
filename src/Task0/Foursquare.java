package Task0;

public class Foursquare implements Square{
    public Foursquare (float a){
        this.a=a;
    }
    private float a;
    @Override
    public float square_fig() {
        return a*a;
    }
}
