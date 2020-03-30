package Demo;

import java.util.Scanner;

public class RedPacketTest {
    public static void main(String[] args) {
        RedPacket redPacket = new RedPacket("大红包");
        System.out.println("请输入群主名称");
        redPacket.setOwnerName(new Scanner(System.in).nextLine());
        redPacket.setOpenWay(new RandomMode());
    }
}
