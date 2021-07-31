package cn.withyyy;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.withyyy.bean.SaveResult;

import java.util.List;
import java.util.Map;

public class GetUserIdFromExcel {
    /**
     * 从/home/ynuos/Desktop/data.xlsx读取信息，以SaveResult的是数组存入List
     * @return
     */
    public static List<SaveResult> getUserIdFromExcel(){
        ExcelReader reader = ExcelUtil.getReader("/home/ynuos/Desktop/data.xlsx");
        List<SaveResult> list = reader.readAll(SaveResult.class);
        return list;
    }
}
