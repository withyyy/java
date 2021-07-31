/**
  * Copyright 2021 bejson.com 
  */
package cn.withyyy.bean;

import lombok.Data;

/**
 * Auto-generated: 2021-07-28 13:48:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class User {

    private String locationInfo;
    private String liveInfo;
    private int anonym;
    private long userId;
    private String avatarDetail;
    private int userType;
    private boolean followed;
    private boolean mutual;
    private String remarkName;
    private String vipRights;
    private String nickname;
    private String avatarUrl;
    private int authStatus;
    private String expertTags;
    private String experts;
    private int vipType;
    private String commonIdentity;
    public void setLocationInfo(String locationInfo) {
         this.locationInfo = locationInfo;
     }
     public String getLocationInfo() {
         return locationInfo;
     }

    public void setLiveInfo(String liveInfo) {
         this.liveInfo = liveInfo;
     }
     public String getLiveInfo() {
         return liveInfo;
     }

    public void setAnonym(int anonym) {
         this.anonym = anonym;
     }
     public int getAnonym() {
         return anonym;
     }

    public void setUserId(long userId) {
         this.userId = userId;
     }
     public long getUserId() {
         return userId;
     }

    public void setAvatarDetail(String avatarDetail) {
         this.avatarDetail = avatarDetail;
     }
     public String getAvatarDetail() {
         return avatarDetail;
     }

    public void setUserType(int userType) {
         this.userType = userType;
     }
     public int getUserType() {
         return userType;
     }

    public void setFollowed(boolean followed) {
         this.followed = followed;
     }
     public boolean getFollowed() {
         return followed;
     }

    public void setMutual(boolean mutual) {
         this.mutual = mutual;
     }
     public boolean getMutual() {
         return mutual;
     }

    public void setRemarkName(String remarkName) {
         this.remarkName = remarkName;
     }
     public String getRemarkName() {
         return remarkName;
     }

    public void setVipRights(String vipRights) {
         this.vipRights = vipRights;
     }
     public String getVipRights() {
         return vipRights;
     }

    public void setNickname(String nickname) {
         this.nickname = nickname;
     }
     public String getNickname() {
         return nickname;
     }

    public void setAvatarUrl(String avatarUrl) {
         this.avatarUrl = avatarUrl;
     }
     public String getAvatarUrl() {
         return avatarUrl;
     }

    public void setAuthStatus(int authStatus) {
         this.authStatus = authStatus;
     }
     public int getAuthStatus() {
         return authStatus;
     }

    public void setExpertTags(String expertTags) {
         this.expertTags = expertTags;
     }
     public String getExpertTags() {
         return expertTags;
     }

    public void setExperts(String experts) {
         this.experts = experts;
     }
     public String getExperts() {
         return experts;
     }

    public void setVipType(int vipType) {
         this.vipType = vipType;
     }
     public int getVipType() {
         return vipType;
     }

    public void setCommonIdentity(String commonIdentity) {
         this.commonIdentity = commonIdentity;
     }
     public String getCommonIdentity() {
         return commonIdentity;
     }

}