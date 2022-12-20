package Task1;

public class Wall implements Obstacle{
    public Wall(int length_Treadmill) {
        this.length_Treadmill=length_Treadmill;
    }
    int length_Treadmill;

    @Override
    public int overcome(Participant participant) {
        StringBuilder s = new StringBuilder(String.valueOf(participant.getClass()));
        s.replace(0, 12,"");
        participant.jump();

        if (length_Treadmill < participant.getM_jump()) {
            System.out.println(s + " jumped over Wall");
            return 1;
        } else {
            System.out.println(s + " not jumped over Wall");
            return 0;
        }
    }

}


