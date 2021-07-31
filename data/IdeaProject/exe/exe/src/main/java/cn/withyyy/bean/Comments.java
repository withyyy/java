/**
  * Copyright 2021 bejson.com 
  */
package cn.withyyy.bean;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2021-07-28 13:48:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Comments {

    private User user;
    private List<String> beReplied;
    private String pendantData;
    private String showFloorComment;
    private int status;
    private long commentId;
    private String content;
    private long time;
    private int likedCount;
    private String expressionUrl;
    private int commentLocationType;
    private int parentCommentId;
    private Decoration decoration;
    private String repliedMark;
    private boolean liked;
    public void setUser(User user) {
         this.user = user;
     }
     public User getUser() {
         return user;
     }

    public void setBeReplied(List<String> beReplied) {
         this.beReplied = beReplied;
     }
     public List<String> getBeReplied() {
         return beReplied;
     }

    public void setPendantData(String pendantData) {
         this.pendantData = pendantData;
     }
     public String getPendantData() {
         return pendantData;
     }

    public void setShowFloorComment(String showFloorComment) {
         this.showFloorComment = showFloorComment;
     }
     public String getShowFloorComment() {
         return showFloorComment;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setCommentId(long commentId) {
         this.commentId = commentId;
     }
     public long getCommentId() {
         return commentId;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setTime(long time) {
         this.time = time;
     }
     public long getTime() {
         return time;
     }

    public void setLikedCount(int likedCount) {
         this.likedCount = likedCount;
     }
     public int getLikedCount() {
         return likedCount;
     }

    public void setExpressionUrl(String expressionUrl) {
         this.expressionUrl = expressionUrl;
     }
     public String getExpressionUrl() {
         return expressionUrl;
     }

    public void setCommentLocationType(int commentLocationType) {
         this.commentLocationType = commentLocationType;
     }
     public int getCommentLocationType() {
         return commentLocationType;
     }

    public void setParentCommentId(int parentCommentId) {
         this.parentCommentId = parentCommentId;
     }
     public int getParentCommentId() {
         return parentCommentId;
     }

    public void setDecoration(Decoration decoration) {
         this.decoration = decoration;
     }
     public Decoration getDecoration() {
         return decoration;
     }

    public void setRepliedMark(String repliedMark) {
         this.repliedMark = repliedMark;
     }
     public String getRepliedMark() {
         return repliedMark;
     }

    public void setLiked(boolean liked) {
         this.liked = liked;
     }
     public boolean getLiked() {
         return liked;
     }

}