package Task1;

public class Treadmill implements Obstacle {
    public Treadmill(int length_Treadmill) {
        this.length_Treadmill = length_Treadmill;
    }

    int length_Treadmill;


    @Override
    public int overcome(Participant participant) {
        StringBuilder s = new StringBuilder(String.valueOf(participant.getClass()));
        s.replace(0, 12,"");
        participant.run();


        if (length_Treadmill < participant.getM_run()) {
            System.out.println(s + " ran Treadmill");
            return 1;
        } else {

            System.out.println(s + " did not ran Treadmill");
            return 0;
        }
    }
}





