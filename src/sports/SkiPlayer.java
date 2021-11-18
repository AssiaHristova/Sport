package sports;

public class SkiPlayer extends WinterSportPlayer{
    @Override
    public void play(){
        System.out.println("We are skiing");
    }
    @Override
    public boolean win(int score) {
        return score >= 8;
    }
}
