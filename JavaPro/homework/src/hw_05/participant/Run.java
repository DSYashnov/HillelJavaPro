package hw_05.participant;

import hw_05.participant.service.GameService;

public class Run {
    public static void main(String[] args) {
        GameService gS = new GameService();
        gS.run(15, 20);
    }
}
