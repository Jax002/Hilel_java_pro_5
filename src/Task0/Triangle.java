package Task0;

import static java.lang.Math.sqrt;

public class Triangle implements Square{
    public Triangle(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private float a;
    private float b;
    private float c;
    private float p=(a+b+c)/2;
    @Override
    public float square_fig() {
     return (float) sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
