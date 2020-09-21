package gcxy.security.service;


import gcxy.security.bean.Chart;
import gcxy.security.mapper.chart.ChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChartService {
    @Autowired(required = false)
    ChartMapper chartMapper;

    /**
     * 获得所有打分表
     * @return
     */
    public List<Chart> getAllCharts(){
        return chartMapper.getAllCharts();
    }

    /**
     * 根据打分表id获取单项
     * @param chart_id
     * @return
     */
    public Chart getChart(int chart_id){
        return  chartMapper.getChart(chart_id);
    }

    /**
     * 根据chapter_id值获取打分表
     * @param chart_id
     * @return
     */
    public List<Chart> getChartByChapter_id(int chart_id ){
        return  chartMapper.getChartByChapter_id(chart_id);
    }
}
