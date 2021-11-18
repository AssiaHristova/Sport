package sports;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SwimmingPlayer swimmer = new SwimmingPlayer();
        swimmer.play();
        swimmer.score = 30;
        swimmer.ranking = 1;
        WaterPoloPlayer poloPlayer = new WaterPoloPlayer();
        poloPlayer.play();
        poloPlayer.score = 5;
        if (swimmer.win(swimmer.score)){
            System.out.println("Yes, you win!");
        }
        if (swimmer.win(swimmer.score, swimmer.ranking)){
            System.out.println("Yes, you are a winner!");
        }

        SportPlayer swimmer2 = new SwimmingPlayer();
        swimmer2.score = 15;
        swimmer2.name = "George";
        SportPlayer poloPlayer2 = new WaterPoloPlayer();
        poloPlayer2.score = 22;
        poloPlayer2.name = "Peter";
        SportPlayer skier = new SkiPlayer();
        skier.score = 5;
        skier.name = "Lindsey";
        SportPlayer snowboarder = new SnowboardPlayer();
        snowboarder.score = 9;
        snowboarder.name = "Jane";
        SportPlayer biathlonPlayer = new BiathlonPlayer();
        biathlonPlayer.score = 12;
        biathlonPlayer.name = "Alex";

        ArrayList<SportPlayer> players = new ArrayList<SportPlayer>();
        players.add(skier);
        players.add(swimmer2);
        players.add(snowboarder);
        players.add(biathlonPlayer);
        players.add(poloPlayer2);

        ArrayList<SportPlayer> winners = new ArrayList<SportPlayer>();

        for (SportPlayer player : players){
            if (player.win(player.score)){
                winners.add(player);
                System.out.printf("%s wins!", player.name);
                System.out.println();
            }
        }



    }
}
