package Demo;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int currentMoney = totalMoney;
        Random random = new Random();
        for (int i = 0; i < totalCount -1; i++){
            int avg = currentMoney/(totalCount-i);
            int money = random.nextInt(2*avg);
            list.add(money);
            currentMoney -= money;
        }
        list.add(currentMoney);
        return list;
    }
}
