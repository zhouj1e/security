package gcxy.security.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Map;

public class CheckList {
    private Integer id;

    private Integer chart_id;

    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date date;

    private Integer check_score;

    private String chart_json;

    private String checker_name;

    private Integer check_id;

    private Integer checker_id;

    private String entity;

    private Map<Integer,String> map;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChart_id() {
        return chart_id;
    }

    public void setChart_id(Integer chart_id) {
        this.chart_id = chart_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCheck_score() {
        return check_score;
    }

    public void setCheck_score(Integer check_score) {
        this.check_score = check_score;
    }

    public String getChart_json() {
        return chart_json;
    }

    public void setChart_json(String chart_json) {
        this.chart_json = chart_json;
    }

    public String getChecker_name() {
        return checker_name;
    }

    public void setChecker_name(String check_name) {
        this.checker_name = check_name;
    }

    public Integer getCheck_id() {
        return check_id;
    }

    public void setCheck_id(Integer check_id) {
        this.check_id = check_id;
    }

    public Integer getChecker_id() {
        return checker_id;
    }

    public void setChecker_id(Integer checker_id) {
        this.checker_id = checker_id;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "CheckList{" +
                "id=" + id +
                ", chart_id=" + chart_id +
                ", date=" + date +
                ", check_score=" + check_score +
                ", chart_json='" + chart_json + '\'' +
                ", checker_name='" + checker_name + '\'' +
                ", check_id=" + check_id +
                ", checker_id=" + checker_id +
                ", entity='" + entity + '\'' +
                ", map=" + map +
                '}';
    }
}
