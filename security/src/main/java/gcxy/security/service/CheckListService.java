package gcxy.security.service;

import gcxy.security.bean.CheckList;
import gcxy.security.mapper.checkList.CheckListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CheckListService {
    @Autowired(required = false)
    CheckListMapper checkListMapper;

    /**
     * 插入单条打分记录
     * @param checkList
     * @return
     */
    public int insertRecord(CheckList checkList){
        return checkListMapper.insertRecord(checkList);
    }

    /**
     * 根据check_id返回指定打分表
     * @param check_id
     * @return
     */
    public CheckList getCheckListById(int check_id){
        return checkListMapper.getCheckListById(check_id);

    }

}
