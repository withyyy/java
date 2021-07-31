/**
  * Copyright 2021 bejson.com 
  */
package cn.withyyy.bean01;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2021-07-28 16:35:54
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class JsonRootBean {

    private int level;
    private int listenSongs;
    private UserPoint userPoint;
    private boolean mobileSign;
    private boolean pcSign;
    private Profile profile;
    private boolean peopleCanSeeMyPlayRecord;
    private List<Bindings> bindings;
    private boolean adValid;
    private int code;
    private long createTime;
    private int createDays;
    public void setLevel(int level) {
         this.level = level;
     }
     public int getLevel() {
         return level;
     }

    public void setListenSongs(int listenSongs) {
         this.listenSongs = listenSongs;
     }
     public int getListenSongs() {
         return listenSongs;
     }

    public void setUserPoint(UserPoint userPoint) {
         this.userPoint = userPoint;
     }
     public UserPoint getUserPoint() {
         return userPoint;
     }

    public void setMobileSign(boolean mobileSign) {
         this.mobileSign = mobileSign;
     }
     public boolean getMobileSign() {
         return mobileSign;
     }

    public void setPcSign(boolean pcSign) {
         this.pcSign = pcSign;
     }
     public boolean getPcSign() {
         return pcSign;
     }

    public void setProfile(Profile profile) {
         this.profile = profile;
     }
     public Profile getProfile() {
         return profile;
     }

    public void setPeopleCanSeeMyPlayRecord(boolean peopleCanSeeMyPlayRecord) {
         this.peopleCanSeeMyPlayRecord = peopleCanSeeMyPlayRecord;
     }
     public boolean getPeopleCanSeeMyPlayRecord() {
         return peopleCanSeeMyPlayRecord;
     }

    public void setBindings(List<Bindings> bindings) {
         this.bindings = bindings;
     }
     public List<Bindings> getBindings() {
         return bindings;
     }

    public void setAdValid(boolean adValid) {
         this.adValid = adValid;
     }
     public boolean getAdValid() {
         return adValid;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setCreateTime(long createTime) {
         this.createTime = createTime;
     }
     public long getCreateTime() {
         return createTime;
     }

    public void setCreateDays(int createDays) {
         this.createDays = createDays;
     }
     public int getCreateDays() {
         return createDays;
     }

}