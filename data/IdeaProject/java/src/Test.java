import Model.HeroNode;
import Model.ListNode;
import Model.SingleLinkedList;
import Model.TreeNode;

import java.util.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode heroNode = new HeroNode(1,"刘一","老大");
        HeroNode heroNode1 = new HeroNode(2,"钱二","老二");
        HeroNode heroNode2 = new HeroNode(7,"孙七","老七");
        singleLinkedList.addBy(heroNode);
        singleLinkedList.addBy(heroNode1);
        singleLinkedList.addBy(heroNode2);
        singleLinkedList.list();
        System.out.println("****");
        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        HeroNode heroNode00 = new HeroNode(5,"王五","老五");
        HeroNode heroNode01 = new HeroNode(3,"张三","老三");
        HeroNode heroNode02 = new HeroNode(6,"赵六","老六");
        HeroNode heroNode03 = new HeroNode(4,"李四","老四");
        singleLinkedList.addBy(heroNode00);
        singleLinkedList.addBy(heroNode03);
        singleLinkedList.addBy(heroNode01);
        singleLinkedList.addBy(heroNode02);
        HeroNode together = SingleLinkedList.together(singleLinkedList.getHead(), singleLinkedList1.getHead());
        SingleLinkedList result = new SingleLinkedList();
        result.getHead().next = together.next;
        result.list();


    }

    //矩形二维数组中，寻找某值是否存在
    public boolean find(int target, int[][] array) {
        //行遍历
        for (int i = 0; i < array.length; i++) {
            //列遍历
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) return true;
            }
        }
        return false;
    }

    public boolean Find(int target, int[][] array) {
        int cols = array[0].length;
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && j < cols) {
            if (target == array[i][j]) {
                return true;
            } else if (target < array[i][j]) {
                i--;
            } else if (target > array[i][j]) {
                j++;
            }
        }
        return false;
    }


    //空格替换
    public String replaceSpace(String s) {
        String replaceAll = s.replaceAll(" ", "%20");
        return replaceAll;
    }

    public String replaceSpace1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(s.charAt(i));
            }

        }
        return stringBuilder.toString();
    }

    /**
     * public class Model.ListNode {
     * int val;
     * Model.ListNode next = null;
     * <p>
     * Model.ListNode(int val) {
     * this.val = val;
     * }
     * }
     */

    //反转链表
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        while (listNode != null) {
            res.add(0, listNode.val);
            listNode = listNode.next;
        }
        return res;
    }

    //根据先序和中序重构二叉树
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == root.val) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
                break;
            }
        }
        return root;
    }

    //两个栈完成队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);
    }

    public int pop() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            return new Integer(null);
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    //旋转数组寻找最小值
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        int first = 0;
        int last = array.length - 1;

        while (first != last) {
            if (array[first] < array[last]) {
                return array[first];
            }
            int mid = ((last - first) >> 1) + first;
            int arrayMid = array[mid];
            int arrayLast = array[last];
            if (arrayMid > arrayLast) {
                first = mid + 1;
            } else if (arrayMid < arrayLast) {
                last = mid;
            } else {
                last--;
            }
        }
        return array[first];
    }

    //斐波那契数列第n项
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    //青蛙跳台阶，一次随便跳，最多跳n个。
    public int jumpFloorII(int target) {

        if (target == 1) return 1;
        int result = 1;
        for (int i = 2; i <= target; i++) {
            result = result * 2;
        }
        return result;
    }

    //输出转换为32位的二进制后，1的个数
    public int NumberOf1(int n) {
        if (n == -2147483648) {
            return 1;
        }
        int count = 0;
        int m = n;
        if (n < 0) {
            m = -n;
        }
        while (m != 0) {
            if (m % 2 == 1) {
                count++;
            }
            m /= 2;
        }
        if (n < 0) {
            if (n % 2 == 0) {
                count = 32 - count;
            } else {
                count = 33 - count;
            }
        }
        return count;
    }

    public int NumberOf1_1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    /*给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

    保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
    */
    public double Power(double base, int exponent) {
        double temp = 1;
        boolean flag = false;
        if (exponent < 0) {
            exponent = -exponent;
            flag = true;
        }

        for (int i = 0; i < exponent; i++) {
            temp = temp * base;
        }
        if (flag) {
            temp = 1.0d / temp;
        }
        return temp;
    }

    public double Power_1(double base, int exponent) {
        double temp = 1;
        double temp1 =1 ;
        boolean flag = false;
        if (exponent < 0) {
            exponent = -exponent;
            flag = true;
        }
        temp = temp * base;

        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                temp1 *= temp;
                temp = temp * temp;
            }
            exponent >>= 1;
        }

        if (flag) {
            temp1 = 1.0d / temp1;
        }
        return temp1;
    }
}
