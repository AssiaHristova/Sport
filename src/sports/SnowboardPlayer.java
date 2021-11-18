package sports;

public class SnowboardPlayer extends WinterSportPlayer{
    @Override
    public void play(){
        System.out.println("We are snowboarding");
    }
    @Override
    public boolean win(int score) {
        return score >= 20;
    }
}
