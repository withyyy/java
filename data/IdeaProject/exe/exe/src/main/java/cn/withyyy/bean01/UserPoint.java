/**
  * Copyright 2021 bejson.com 
  */
package cn.withyyy.bean01;

/**
 * Auto-generated: 2021-07-28 16:35:54
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class UserPoint {

    private long userId;
    private int balance;
    private long updateTime;
    private int version;
    private int status;
    private int blockBalance;
    public void setUserId(long userId) {
         this.userId = userId;
     }
     public long getUserId() {
         return userId;
     }

    public void setBalance(int balance) {
         this.balance = balance;
     }
     public int getBalance() {
         return balance;
     }

    public void setUpdateTime(long updateTime) {
         this.updateTime = updateTime;
     }
     public long getUpdateTime() {
         return updateTime;
     }

    public void setVersion(int version) {
         this.version = version;
     }
     public int getVersion() {
         return version;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setBlockBalance(int blockBalance) {
         this.blockBalance = blockBalance;
     }
     public int getBlockBalance() {
         return blockBalance;
     }

}