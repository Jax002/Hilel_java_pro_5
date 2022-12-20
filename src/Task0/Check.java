package Task0;

public class Check {
    public static void main(String[] args) {
        Square [] square = new Square[3];
        square[0]=new Circle(12);
        square[1]=new Triangle(1,2,3);
        square[2]=new Foursquare(34);
        float sum_square=0;
        for (Square s : square ) {
            sum_square=sum_square+s.square_fig();

        }
        System.out.println(sum_square);
    }
}
