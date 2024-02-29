import java.util.Scanner;

//用户选择双色球号码
public class UserChoice {

    //用户选择的红球号码空间
    int[] userChooseRedBalls = new int[6];

    //用户选择的蓝球号码空间
    int userChooseBlueBall;

    //用户选择红球号码
    public void setUserChooseRedBalls() {
        boolean test = true;

        Scanner input = new Scanner(System.in);

        while(test) {
            for (int i = 0; i < userChooseRedBalls.length; i++) {
                System.out.println("请输入第" + (i + 1) + "个红球号码: ");
                userChooseRedBalls[i] = input.nextInt();

                //判断红球号码是否在1-33之间
                while(userChooseRedBalls[i] < 1 || userChooseRedBalls[i] > 33) {
                    System.out.println("红球号码输入错误,请重新输入");
                    userChooseRedBalls[i] = input.nextInt();
                }
            }

            //判断红球号码是否重复
            for (int i = 0; i < userChooseRedBalls.length; i++) {
                for (int j = 0; j < userChooseRedBalls.length; j++) {
                    if(userChooseRedBalls[i] == userChooseRedBalls[j] && i != j) {
                        System.out.println("红球号码不能重复,请重新输入");
                        test = true;
                        break;
                    } else {
                        test = false;
                    }
                }
            }

        }

    }

    //用户选择蓝球号码
    public void setUserChooseBlueBall() {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入蓝球号码:");
        userChooseBlueBall = input.nextInt();
    }

}
