package sports;

public class SwimmingPlayer extends WaterSportPlayer{
    @Override
    public void play(){
        System.out.println("We are swimming");
    }
    @Override
    public boolean win(int score) {
        return score >= 20;
    }

    public boolean win(int score, int raking) {
        return score >= 20 & raking <= 3;
    }
}
