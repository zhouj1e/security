package gcxy.security.service;

import gcxy.security.bean.Rule;
import gcxy.security.mapper.rule.RuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RuleService {
    @Autowired(required = false)
    RuleMapper ruleMapper;

    /**
     * 获取所有规则
     *
     * @return
     */
    public List<Rule> getAllRules() {
        return ruleMapper.getAllRules();
    }

    /**
     * 获取规则单项
     *
     * @param rule_id
     * @return
     */
    public Rule getRule(int rule_id) {
        return ruleMapper.getRule(rule_id);
    }

    /**
     * 获取打分表对应规则
     *
     * @param chapter_id
     * @return
     */
    public List<Rule> getRuleByChart_id(int chapter_id) {
        return ruleMapper.getRuleByChart_id(chapter_id);
    }
}
