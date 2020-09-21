package gcxy.security.mapper.rule;

import gcxy.security.bean.Rule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RuleMapper {
    /**
     * 获取所有规则
     */
    List<Rule> getAllRules();

    /**
     * 获取规则单项
     * @param id
     * @return
     */
    Rule getRule(@Param("rule_id") int rule_id);

    /**
     * 获取打分表对应规则
     * @param chart_id
     * @return
     */
    List<Rule> getRuleByChart_id(@Param("chart_id")int chart_id);
}
