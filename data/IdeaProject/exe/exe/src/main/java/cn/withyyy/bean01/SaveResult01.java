package cn.withyyy.bean01;

import lombok.Data;

import java.util.Date;

@Data
public class SaveResult01 {
    private long userId;
    private String nickname;
    private int gender;
    private int age;
    private Date birthday;
    private int vipType;
    private int level;
    private String sign;
    private int eventCount;
    private int followsCount;
    private long province;
    private long city;
    private int listenSongs;
}
