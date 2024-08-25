package hw_05.participant.service;

import hw_05.participant.Cat;
import hw_05.participant.Human;
import hw_05.participant.Participant;
import hw_05.participant.Robot;
import hw_05.participant.obstacle.Obstacle;
import hw_05.participant.obstacle.Road;
import hw_05.participant.obstacle.Wall;

import java.util.Random;

public class Generator {

    Participant[] generateParticipant (int participantNumber){
        Participant[] arr = new Participant[participantNumber];
        for (int i = 0; i < participantNumber; i++) {
            int number = getRandomNumber(1, 3);
            switch (number){
                case 1 -> arr[i] = new Human("Human_" + i, getRandomNumber(0, 2), getRandomNumber(50, 100));
                case 2 -> arr[i] = new Cat("Cat_" + i, getRandomNumber(0, 1), getRandomNumber(5, 15));
                case 3 -> arr[i] = new Robot("Robot_" + i, getRandomNumber(0, 10), getRandomNumber(50, 1000));
            }
        }

        return  arr;
    }

    Obstacle[] generateObstacle (int obstacleNumber){
        Obstacle[] arr = new Obstacle[obstacleNumber];
        for (int i = 0; i < obstacleNumber; i++) {
            int number = getRandomNumber(1, 3);
            switch (number){
                case 1 -> arr[i] = new Road(getRandomNumber(50, 100));
                case 2 -> arr[i] = new Wall(getRandomNumber(5, 15));
            }
        }
        return  arr;
    }


    private int getRandomNumber(int min, int max){
        return (int) ((Math.random()*(max-min))+min);
    }
}
