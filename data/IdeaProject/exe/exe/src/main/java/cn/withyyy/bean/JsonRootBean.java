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
public class JsonRootBean {

    private boolean isMusician;
    private int userId;
    private List<String> topComments;
    private int code;
    private List<Comments> comments;
    private long total;
    private boolean more;
    public void setIsMusician(boolean isMusician) {
         this.isMusician = isMusician;
     }
     public boolean getIsMusician() {
         return isMusician;
     }

    public void setUserId(int userId) {
         this.userId = userId;
     }
     public int getUserId() {
         return userId;
     }

    public void setTopComments(List<String> topComments) {
         this.topComments = topComments;
     }
     public List<String> getTopComments() {
         return topComments;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setComments(List<Comments> comments) {
         this.comments = comments;
     }
     public List<Comments> getComments() {
         return comments;
     }

    public void setTotal(long total) {
         this.total = total;
     }
     public long getTotal() {
         return total;
     }

    public void setMore(boolean more) {
         this.more = more;
     }
     public boolean getMore() {
         return more;
     }

}