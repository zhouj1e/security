package gcxy.security.mapper.chapter;

import gcxy.security.bean.Chapter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChapterMapper {
    //获得全部章节
    List<Chapter> getAllChapter();

}
