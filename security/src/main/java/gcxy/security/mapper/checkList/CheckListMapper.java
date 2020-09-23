package gcxy.security.mapper.checkList;

import gcxy.security.bean.CheckList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CheckListMapper {
    /**
     * 插入打分记录
     * @param check
     * @return
     */
    int insertRecord(CheckList check);

    CheckList getCheckListById(@Param("id")int check_id);
}
