package sports;

public class SportPlayer {

    public String name;
    public int score;
    public int ranking;

    public void play(){
        System.out.println("We play sport");
    }

    public boolean win(int score){
        return score >= 6;
    }

}
