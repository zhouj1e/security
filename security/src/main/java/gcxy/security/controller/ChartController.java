package gcxy.security.controller;

import com.sun.istack.internal.NotNull;
import gcxy.security.service.ChartService;
import gcxy.security.utils.ResponseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartController {
    @Autowired
    ChartService chartService;

    /**
     * 获取所有的表格
     *
     * @return
     */
    @GetMapping("/charts")
    public ResponseInformation getAllCharts() {
        return ResponseInformation.success(chartService.getAllCharts());
    }

    /**
     * 根据打分表id获得打分表单项
     * @param chart_id
     * @return
     */
    @GetMapping("/chart/record")
    public ResponseInformation getChart(@NotNull int chart_id) {
        return ResponseInformation.success(chartService.getChart(chart_id));
    }

    /**
     * 根据章节id获得指定打分项目
     * @param chapter_id
     * @return
     */
    @GetMapping("/chart")
    public ResponseInformation getChartByChapter_id(@NotNull  String chapter_id){
        return ResponseInformation.success(chartService.getChartByChapter_id(chapter_id));
    }

    /**
     * 根据chart_id获取regulation
     * @param chart_id
     * @return
     */
    @GetMapping("/regulation")
    public ResponseInformation getRegulationByChartId(@NotNull int chart_id){
        return ResponseInformation.success(chartService.getRegulationByChartId(chart_id));
    }
}
