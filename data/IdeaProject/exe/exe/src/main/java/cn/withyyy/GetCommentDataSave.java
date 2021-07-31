package cn.withyyy;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.BigExcelWriter;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import cn.withyyy.bean.Comments;
import cn.withyyy.bean.JsonRootBean;
import cn.withyyy.bean.SaveResult;

import java.util.ArrayList;
import java.util.List;


public class GetCommentDataSave {

    /**
     * 从https://music.163.com/api/v1/resource/comments/R_SO_4_{}?limit={}&offset={}
     * 获取一些数据，
     * 包含非常多的评论信息页。
     * 将他们分别保存到SaveResult对象中，只保留：
     * commentId
     * comment;
     * likedCount;
     * time;
     * usrId;
     * 最后，存储到/home/ynuos/Desktop/data.xlsx中
     *
     * @param songId 歌曲id
     * @param num   需要爬取的评论数量
     * @param limit 每条请求获取多少条评论
     * @param offset  跳过前多少条评论
     */
    public static void getCommentData(long songId, int num, int limit, int offset) {
        List<SaveResult> list = new ArrayList<>();
        boolean empty = false;
        for (int i = 0; i < num / limit; i++) {
            String url = HttpUtil.get("https://music.163.com/api/v1/resource/comments/R_SO_4_" + songId + "?limit=" + limit + "&offset=" + offset);
            JsonRootBean jsonRootBean = JSONUtil.toBean(url, JsonRootBean.class);
            if (jsonRootBean.getComments().size() < limit) {
                break;
            }
            for (int j = 0; j < limit; j++) {
                Comments comments = jsonRootBean.getComments().get(j);
                SaveResult saveResult = new SaveResult();
                saveResult.setCommentId(comments.getCommentId());
                saveResult.setComment(comments.getContent());
                saveResult.setUsrId(comments.getUser().getUserId());
                saveResult.setLikedCount(comments.getLikedCount());
                saveResult.setTime(DateUtil.date(comments.getTime()));
                list.add(saveResult);
            }
            offset += limit;
        }
        System.out.println(list);
        BigExcelWriter excelWriter = ExcelUtil.getBigWriter("/home/ynuos/Desktop/data.xlsx");
        excelWriter.write(list);
        excelWriter.close();
    }
}
