package sports;

public class WaterSportPlayer extends SportPlayer{
    @Override
    public void play(){
        System.out.println("We play water sport");
    }
    @Override
    public boolean win(int score) {
        return score >= 10;
    }
}
