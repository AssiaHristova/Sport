package sports;

public class WinterSportPlayer extends SportPlayer{
    @Override
    public void play(){
        System.out.println("We play winter sport");
    }
    @Override
    public boolean win(int score) {
        return score >= 8;
    }
}
