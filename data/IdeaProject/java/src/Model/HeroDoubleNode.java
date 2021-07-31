package Model;

public class HeroDoubleNode {
    public int no;
    public String name;
    public String nickname;
    public HeroDoubleNode pre;
    public HeroDoubleNode next;

    @Override
    public String toString() {
        return "HeroDoubleNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public HeroDoubleNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
}
