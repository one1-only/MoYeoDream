package com.project.moyeodream.service;

import com.project.moyeodream.domain.vo.Criteria;
import com.project.moyeodream.domain.vo.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostServiceTest {

    @Autowired
    private PostService postService;

    // 게시글 전체 목록
//    @Test
    public void getList(){
        log.info("----------------------------------------");
        log.info("service getList.....................");
        log.info("----------------------------------------");

        Criteria criteria = new Criteria();
        postService.getList(criteria);
    }

    // 게시글 상세보기
//    @Test
    public void readTest(){
        log.info("----------------------------------------");
        log.info("service read.....................");
        log.info("----------------------------------------");

        log.info(postService.postRead(145).toString());
    }

    // 게시글 수정 완료
//    @Test
    public void modifyOkTest(){
        log.info("----------------------------------------");
        log.info("service modifyOk.....................");
        log.info("----------------------------------------");

        PostVO postVO = new PostVO();
        postVO.setPostTitle("수정테스트");
        postVO.setPostContent("수정DAO test");
        postVO.setPostNumber(44);

        postService.postUpdate(postVO);
    }

    // 게시글 삭제 완료
//    @Test
    public void deleteTest(){
        log.info("----------------------------------------");
        log.info("service deleteOk.....................");
        log.info("----------------------------------------");

        postService.postDelete(144);
    }
}
