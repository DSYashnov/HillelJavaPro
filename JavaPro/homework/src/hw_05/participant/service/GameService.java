package hw_05.participant.service;

import hw_05.participant.Participant;
import hw_05.participant.obstacle.Obstacle;
import hw_05.participant.obstacle.Road;
import hw_05.participant.obstacle.Wall;

public class GameService {
    public void run(int userNumber, int obstacleNumber){
        Generator gen = new Generator();
        Participant[] participants = gen.generateParticipant(userNumber);
        Obstacle[] obstacles = gen.generateObstacle(obstacleNumber);

        for (Participant p : participants){
            System.out.println(p);
            for (Obstacle obs : obstacles){
                System.out.println(">>>>>>>" + obs);
                if(obs instanceof Wall){
                    int jump = p.getJump();
                    if (jump < ((Wall)obs).getHeight()){
                        System.out.println("fail");
                        break;
                    } else {
                        System.out.println("next...");
                    }
                } else if (obs instanceof Road) {
                    int run = p.getRun();
                    if (run < ((Road)obs).getLenghts()){
                        System.out.println("fail");
                        break;

                } else {
                    System.out.println("next...");
                }
                }
            }
        }
    }
}
