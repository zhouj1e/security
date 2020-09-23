package gcxy.security.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.istack.internal.NotNull;
import gcxy.security.bean.CheckList;
import gcxy.security.service.CheckListService;
import gcxy.security.utils.ResponseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/checkList")
public class CheckListController {
    @Autowired
    CheckListService checkListService;

    /**
     * 将前台的json对象存入数据库中 插入单条打分记录
     * @param json
     * @return
     */
    @PostMapping("/")
    public ResponseInformation insertCheckRecord(@RequestBody JSONObject json) {
        CheckList check = new CheckList();
        DateFormat df=DateFormat.getDateTimeInstance();
        check.setCheck_id(df.format(new Date()).toString());
        check.setCheck_json(json.toJSONString());

        return ResponseInformation.success(checkListService.insertRecord(check));

    }

    /**
     * 根据前台生成的id查询打分单条记录
     *
     * @param check_id
     * @return
     */
    @GetMapping("/check")
    public ResponseInformation getCheckListById(@NotNull int check_id) {


        return ResponseInformation.success(checkListService.getCheckListById(check_id));
    }

}
