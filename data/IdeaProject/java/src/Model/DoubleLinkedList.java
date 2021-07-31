package Model;

public class DoubleLinkedList {
    private HeroDoubleNode head = new HeroDoubleNode(0,"","");

    /**
     * 遍历链表
     */
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroDoubleNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            System.out.println(temp);
        }
    }

    public void add(HeroDoubleNode heroNode) {
        HeroDoubleNode temp = head;

        //遍历链表，找到最后一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;
    }


}
