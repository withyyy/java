package cn.withyyy.bean;

import lombok.Data;

import java.util.Date;

@Data
public class SaveResult {
    private Long commentId;
    private String comment;
    private Integer likedCount;
    private Date time;
    private Long usrId;
}
