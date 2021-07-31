import cn.hutool.poi.excel.BigExcelWriter;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.withyyy.bean.SaveResult;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WashData {
    public static void washCommentData(){
        ExcelReader reader = ExcelUtil.getReader("/home/ynuos/Desktop/data.xlsx");
        List<SaveResult> list = reader.readAll(SaveResult.class);
        Iterator<SaveResult> iterator = list.listIterator();
        while (iterator.hasNext()){
            SaveResult saveResult = iterator.next();
            String s = saveResult.getComment();
            Pattern compile = Pattern.compile("[A-Z]|[a-z]|[0-9]|[\\u4e00-\\u9fa5]");
            Matcher matcher = compile.matcher(s);
            StringBuilder stringBuilder = new StringBuilder();
            while (matcher.find()) {
                stringBuilder.append(matcher.group());
            }
            saveResult.setComment(stringBuilder.toString());
            if (saveResult.getComment().length()==0){
                iterator.remove();
            }
        }
        BigExcelWriter bigWriter = ExcelUtil.getBigWriter("/home/ynuos/Desktop/pureData.xlsx");
        bigWriter.write(list);
        bigWriter.close();
    }
}
