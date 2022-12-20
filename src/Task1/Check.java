package Task1;

public class Check {
    public static void main(String[] args) {
        Participant[] participant = new Participant[3];
        participant[0] = new Men(122, 1);
        participant[1] = new Cat(2, 245);
        participant[2] = new Robot(3234, 4324);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Wall(12);
        obstacles[1] = new Treadmill(58);


        for (Participant p : participant) {
            System.out.println("-----------");
            for (Obstacle o : obstacles) {
                if (o.overcome(p) == 0) {
                    break;
                }
            }
        }
    }
}
