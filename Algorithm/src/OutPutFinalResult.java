//输出中奖结果
public class OutPutFinalResult {


    public void outPutFinalResult() {

        int redBalls = 0;

        UserChoice userChoice = new UserChoice();
        RandomBalls randomBalls = new RandomBalls();

        userChoice.setUserChooseRedBalls();
        userChoice.setUserChooseBlueBall();

        randomBalls.setRedBalls();
        randomBalls.setBlueBall();

        //累计红球中奖个数
        for (int i = 0; i < userChoice.userChooseRedBalls.length; i++) {
            for (int j = 0; j < userChoice.userChooseRedBalls.length; j++) {
                if (userChoice.userChooseRedBalls[i] == randomBalls.redBalls[j]) {
                    redBalls++;
                }
            }
        }

        //判断蓝球是否中奖
        boolean blueBall = false;
        if (userChoice.userChooseBlueBall == randomBalls.blueBall) {
            blueBall = true;
        }

        //本期中奖号码
        System.out.println("本期红球中奖号码为: ");
        for (int i = 0; i < randomBalls.redBalls.length; i++) {
            System.out.print(randomBalls.redBalls[i] + " ");
        }
        System.out.println("蓝球号码为: " + randomBalls.blueBall);


        //输出中奖结果
        if (redBalls == 6 && blueBall) {
            System.out.println("恭喜你中了一等奖");
        } else if (redBalls == 6) {
            System.out.println("恭喜你中了二等奖");
        } else if (redBalls == 5 && blueBall) {
            System.out.println("恭喜你中了三等奖");
        } else if (redBalls == 5 || (redBalls == 4 && blueBall)) {
            System.out.println("恭喜你中了四等奖");
        } else if (redBalls == 4 || (redBalls == 3 && blueBall)) {
            System.out.println("恭喜你中了五等奖");
        } else {
            System.out.println("很遗憾,你没有中奖");
        }

    }
}