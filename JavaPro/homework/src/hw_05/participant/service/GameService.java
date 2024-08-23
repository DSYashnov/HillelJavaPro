package hw_05.participant.service;

import hw_05.participant.Participant;

public class GameService {
    public void run(int userNumber, int obstacleNumber){
        Generator gen = new Generator();
        Participant[] participants = gen.generateParticipant(15);
        for (Participant p : participants){
            System.out.println(p);
        }
    }
}
