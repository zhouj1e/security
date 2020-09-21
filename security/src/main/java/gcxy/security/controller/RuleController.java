package gcxy.security.controller;

import com.sun.istack.internal.NotNull;
import gcxy.security.service.RuleService;
import gcxy.security.utils.ResponseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController {

    @Autowired
    RuleService ruleService;

    /**
     * 获取所有规则
     *
     * @return
     */
    @GetMapping("/rules")
    public ResponseInformation getAllRules() {
        return ResponseInformation.success(ruleService.getAllRules());
    }

    /**
     * 获取规则单项
     *
     * @param rule_id
     * @return
     */
    @GetMapping("/rule/record")
    public ResponseInformation getRule(@NotNull int rule_id) {
        return ResponseInformation.success(ruleService.getRule(rule_id));
    }

    /**
     * 根据打分表id获取相关规则
     *
     * @param chart_id
     * @return
     */
    @GetMapping("/rule")
    public ResponseInformation getRuleByChart_id(@NotNull int chart_id) {
        return ResponseInformation.success(ruleService.getRuleByChart_id(chart_id));
    }
}
