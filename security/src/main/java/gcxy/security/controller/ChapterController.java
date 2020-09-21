package gcxy.security.controller;


import gcxy.security.service.ChapterService;
import gcxy.security.utils.ResponseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/chapter")
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @GetMapping("/chapters")
    public ResponseInformation getAllChapter() {
        return ResponseInformation.success(chapterService.getAllChapter());
    }

}
