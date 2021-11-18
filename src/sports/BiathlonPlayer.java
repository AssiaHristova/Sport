package sports;

public class BiathlonPlayer extends WinterSportPlayer{
    @Override
    public void play(){
        System.out.println("We play biathlon");
    }
    @Override
    public boolean win(int score) {
        return score >= 8;
    }
}
