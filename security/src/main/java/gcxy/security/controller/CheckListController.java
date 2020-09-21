package gcxy.security.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.istack.internal.NotNull;
import gcxy.security.bean.CheckList;
import gcxy.security.service.CheckListService;
import gcxy.security.utils.ResponseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/checkList")
public class CheckListController {
    @Autowired
    CheckListService checkListService;

    /**
     * 插入前台的打分表记录
     * @param chart_id
     * @param check_score
     * @param chart_json
     * @param checker_name
     * @param checker_id
     * @return
     */
    @PostMapping("/")
    public ResponseInformation insertRecord(@NotNull int chart_id,@NotNull int check_score,@NotNull String chart_json,@NotNull String checker_name,@NotNull int checker_id,@NotNull int check_id){
        CheckList check=new CheckList();
        Map map= (Map) JSON.parse(chart_json);  //解析json串

        check.setChart_id(chart_id);
        check.setCheck_score(check_score);
        check.setChart_json(chart_json);
        check.setChecker_name(checker_name);
        check.setDate(new Date());
        check.setChecker_id(checker_id);
        check.setCheck_id(check_id);
        check.setMap(map);
        check.setEntity(JSON.toJSONString(check));//将对象解析存为json
        return ResponseInformation.success(checkListService.insertRecord(check));

    }

    /**
     * 根据前台生成的id查询打分单条记录
     * @param check_id
     * @return
     */
    @GetMapping("/check")
    public ResponseInformation getCheckListById(@NotNull int  check_id){


        return ResponseInformation.success(checkListService.getCheckListById(check_id));
    }

}
