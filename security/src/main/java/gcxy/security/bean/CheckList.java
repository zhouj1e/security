package gcxy.security.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Blob;
import java.util.Date;

public class CheckList {




  /*  @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date datetime;*/


    private String check_json;

    private String check_id;

    public String getCheck_json() {
        return check_json;
    }

    public void setCheck_json(String check_json) {
        this.check_json = check_json;
    }

    public String getCheck_id() {
        return check_id;
    }

    public void setCheck_id(String check_id) {
        this.check_id = check_id;
    }
}
