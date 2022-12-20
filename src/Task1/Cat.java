package Task1;

public class Cat implements Participant {
    public Cat(int m_run, int m_jump){
        this.m_run=m_run;
        this.m_jump=m_jump;
    }

    private      int m_run;
    private      int m_jump;

    @Override
    public int getM_run() {
        return m_run;
    }

    @Override
    public int getM_jump() {
        return m_jump;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");

    }
}
