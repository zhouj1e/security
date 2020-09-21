package gcxy.security.service;

import gcxy.security.bean.Chapter;
import gcxy.security.mapper.chapter.ChapterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChapterService {
    @Autowired(required = false)
    ChapterMapper chapterMapper;

    //获取所有章节
    public List<Chapter> getAllChapter(){
        return chapterMapper.getAllChapter();
    }



}
