package cn.withyyy;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.BigExcelWriter;
import cn.hutool.poi.excel.ExcelUtil;
import cn.withyyy.bean.SaveResult;
import cn.withyyy.bean01.JsonRootBean;
import cn.withyyy.bean01.Profile;
import cn.withyyy.bean01.SaveResult01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetUserDataSave {
    /**
     * 从https://music.163.com/api/v1/user/detail/{}
     * 反复获取一些数据，
     * 每次请求的返回包含一条user的详细信息
     * 将他们分别保存到SaveResult01对象中，只保留：
     *      userId;
     *      nickname;
     *      gender;
     *      age;
     *      birthday;
     *      vipType;
     *      level;
     *      sign;
     *      eventCount;
     *      followsCount;
     *      province;
     *      city;
     *      listenSongs;
     * 最后，存储到/home/ynuos/Desktop/data.xlsx中
     *
     * @param list 包含userId的评论信息数组
     */
    public static void getUserData(List<SaveResult> list) {
        List<SaveResult01> result01List = new ArrayList<>();
        for (SaveResult saveResult :
                list) {
            Long usrId = saveResult.getUsrId();
            String response = HttpUtil.get("https://music.163.com/api/v1/user/detail/" + usrId);
            JsonRootBean jsonRootBean = JSONUtil.toBean(response, JsonRootBean.class);
            if (jsonRootBean.getCode() != 200) {
                System.out.println("跳过了一个");
                continue;
            }
            SaveResult01 saveResult01 = new SaveResult01();
            Profile profile = jsonRootBean.getProfile();
            saveResult01.setBirthday(DateUtil.date(Math.abs(profile.getBirthday())));
            if (DateUtil.compare(saveResult01.getBirthday(), DateUtil.date()) > 0) {
                saveResult01.setAge(-1);
            } else {
                saveResult01.setAge(DateUtil.ageOfNow(saveResult01.getBirthday()));
            }
            saveResult01.setCity(profile.getCity());
            saveResult01.setEventCount(profile.getEventCount());
            saveResult01.setUserId(profile.getUserId());
            saveResult01.setGender(profile.getGender());
            saveResult01.setLevel(jsonRootBean.getLevel());
            saveResult01.setNickname(profile.getNickname());
            saveResult01.setFollowsCount(profile.getFollows());
            saveResult01.setListenSongs(jsonRootBean.getListenSongs());
            saveResult01.setProvince(profile.getProvince());
            saveResult01.setSign(profile.getSignature());
            saveResult01.setVipType(profile.getVipType());
            result01List.add(saveResult01);
        }
        BigExcelWriter bigWriter = ExcelUtil.getBigWriter("/home/ynuos/Desktop/userData.xlsx");
        bigWriter.write(result01List);
        bigWriter.close();
    }
}
