package gcxy.security.utils;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseInformation {
    private int state;

    private String msg;

    private Object obj;

    public ResponseInformation(int state, String msg) {
        this.state = state;
        this.msg = msg;
        this.obj = null;
    }

    public ResponseInformation(int state, String msg, Object obj) {
        this.state = state;
        this.msg = msg;
        this.obj = obj;
    }
    // 200 成功
    // 302 验证错误，403 权限错误
    // 400 一般错误，401 参数错误，402 文件系统错误，407 数据库错误
    public  static ResponseInformation success(){
        return new ResponseInformation(200,"成功");
    }

    public static ResponseInformation success(Object obj){
        return new ResponseInformation(200,"成功",obj);
    }

    public static ResponseInformation error_normal(String msg){
        return new ResponseInformation(400,msg);
    }
    public static ResponseInformation error_database(String msg){
        return new ResponseInformation(407,msg);
    }
    public static ResponseInformation error_param(String msg){
        return new ResponseInformation(400,msg);
    }
    public static ResponseInformation error_file(String msg){
        return new ResponseInformation(402,msg);
    }

}
