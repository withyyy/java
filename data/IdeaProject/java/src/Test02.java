import Model.ArrayQueue;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s: 显示队列");
            System.out.println("e: 退出程序");
            System.out.println("a: 添加数据到队列");
            System.out.println("g: 从队列取出数据");
            System.out.println("h: 查看队列头");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.list();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    return;
                case 'a':
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    arrayQueue.add(value);
                    break;
                case 'g':
                    try {
                        int i = arrayQueue.get();
                        System.out.println("取出的数据是: " + i);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int head = arrayQueue.head();
                        System.out.println("头部数据为: " + head);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}

