package gcxy.security.mapper.chart;

import gcxy.security.bean.Chart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ChartMapper {
    /**
     * 获取所有打分表
     * @return
     */
    List<Chart> getAllCharts();

    /**
     * 根据id获取打分表单项
     * @param chart_id
     * @return
     */
    Chart getChart(@Param("chart_id")  int chart_id);

    /**
     * 根据cahpter_id获取打分表
     * @param chapter_id
     * @return
     */
    List<Chart>getChartByChapter_id(@Param("chapter_id")  int chapter_id);
}
