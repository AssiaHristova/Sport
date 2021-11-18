package sports;

public class WaterPoloPlayer extends WaterSportPlayer{
    @Override
    public void play(){
        System.out.println("We play water polo");
    }
    @Override
    public boolean win(int score) {
        return score >= 15;
    }
}
