//随即生成彩球号码

import java.util.Random;

public class RandomBalls {
    int[] redBalls = new int[6];
    int blueBall;

    public void setRedBalls() {

        Random random = new Random();

        //生成红球
        for (int i = 0; i < redBalls.length; i++) {
            redBalls[i] = random.nextInt(33) + 1;
        }

        //去重
        for (int i = 0; i < redBalls.length; i++) {
            for (int j = 0; j < redBalls.length; j++) {
                if(redBalls[i] == redBalls[j] && i != j) {
                    redBalls[i] = random.nextInt(32) + 1;
                    i = 0;
                    j = 0;
                }
            }
        }

    }

    //生成蓝球
    public void setBlueBall() {
        Random random = new Random();
        blueBall = random.nextInt(16) + 1;
    }

}
