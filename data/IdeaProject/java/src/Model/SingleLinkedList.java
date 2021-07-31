package Model;

import java.util.Stack;

/**
 * 单链表
 */
public class SingleLinkedList {
    private HeroNode head = new HeroNode(0, null, null);

    //获取头节点
    public HeroNode getHead() {
        return head;
    }

    //返回第倒数第k个节点
    public static HeroNode findLastK(HeroNode head, int index) {
        if (index < 1) {
            System.out.println("不存在这个节点");
            return null;
        }
        HeroNode cur = head;
        int count = 0;
        if (head.next == null) {
            return null;
        }
        while (true) {
            if (cur.next != null) {
                count++;
            } else {
                break;
            }
            cur = cur.next;
        }
        if (index > count) {
            System.out.println("不存在这个节点");
            return null;
        }
        cur = head;
        for (int i = 0; i < count - index + 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //获取链表长度
    public static int getLength(HeroNode head) {
        int count = 0;

        while (true) {
            if (head.next == null) {
                return count;
            }
            count++;
            head = head.next;
        }
    }

    //尾部添加
    public void add(HeroNode heroNode) {
        HeroNode temp = head;

        //遍历链表，找到最后一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    //插入（按序号）
    public boolean addBy(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = heroNode;
                return true;
            } else if (temp.next.no > heroNode.no) {
                heroNode.next = temp.next;
                temp.next = heroNode;
                break;
            } else if (temp.next.no == heroNode.no) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    //展现
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            System.out.println(temp);
        }
    }

    //修改节点（根据no）
    public void update(HeroNode heroNode) {
        HeroNode temp = head;

        while (true) {
            if (temp.next == null) {
                System.out.println("未找到需要修改的节点");
                return;
            }
            if (temp.next.no == heroNode.no) {
                heroNode.next = temp.next.next;
                temp.next = heroNode;
                System.out.println("修改成功");
                return;
            }
            temp = temp.next;
        }

    }

    //删除节点（根据no）
    public void delete(int no) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.println("未能找到需要删除的节点");
                return;
            } else if (temp.next.no == no) {
                temp.next = temp.next.next;
                System.out.println("删除成功");
                return;
            }
            temp = temp.next;
        }
    }

    //反转链表（头插式）
    public static HeroNode reverseList(HeroNode head) {
        HeroNode cur = head.next;
        HeroNode reserveHead = new HeroNode(0, "", "");

        if (cur == null || cur.next == null) {
            return head;
        }
        while (cur != null) {
            HeroNode next = cur.next;
            cur.next = reserveHead.next;
            reserveHead.next = cur;
            cur = next;
        }
        head.next = reserveHead.next;
        return head;
    }

    /**
     * 逆序输出链表
     *
     * @param head
     */
    public static void printTsil(HeroNode head) {
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    /**
     * 反转链表（栈式）
     *
     * @param head
     * @return
     */
    public static HeroNode tsil(HeroNode head) {
        HeroNode cur = head.next;

        Stack<HeroNode> stack = new Stack<>();
        while (cur != null) {
            HeroNode next = cur.next;
            cur.next = null;
            stack.push(cur);
            cur = next;
        }   //将每个节点存入栈中,存的过程中，切断各自的联系
        HeroNode tsilHead = new HeroNode(0, "", ""); //反转链表的头节点
        HeroNode shangYiGePop = null;   //记录上一个弹出的节点
        while (!stack.isEmpty()) {
            HeroNode pop = stack.pop(); //弹出一个节点
            if (shangYiGePop == null) {
                tsilHead.next = pop;
            } else {
                shangYiGePop.next = pop;
            }   //如果上一个弹出的节点是空，则添加到头节点后，如果上一个弹出的节点不为空，则添加到上一个节点后
            shangYiGePop = pop;
        }
        head.next = tsilHead.next;
        return head;
    }

    /**
     * 有序合并链表
     * @param head1
     * @param head2
     * @return
     */
    public static HeroNode together(HeroNode head1, HeroNode head2) {
        HeroNode cur1 = head1.next;
        HeroNode cur2 = head2.next;
        HeroNode t_head = new HeroNode(0, "", "");
        HeroNode temp = t_head;
        while (cur1 != null || cur2 != null) {
            if (cur1 == null) {
                temp.next = cur2;
                break;
            }
            if (cur2 == null) {
                temp.next = cur1;
                break;
            }
            if (cur1.no < cur2.no) {
                HeroNode next = cur1.next;
                temp.next = cur1;
                cur1 = next;
            } else {
                HeroNode next = cur2.next;
                temp.next = cur2;
                cur2 = next;
            }
            temp = temp.next;
        }
        return t_head;
    }
}