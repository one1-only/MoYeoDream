package com.project.moyeodream.domain.dao;

import com.project.moyeodream.domain.vo.Criteria;
import com.project.moyeodream.domain.vo.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostDaoTests {

    @Autowired
    private PostDAO postDAO;

    /* 게시글 추가 */
//    @Test
    public void registerTest(){
        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트 제목");
        postVO.setPostCategory("테스트 카테고리");
        postVO.setPostContent("테스트 내용");

        postDAO.postRegister(postVO);
        log.info("새롭게 추가된 게시글 번호 : "+ postVO.getPostNumber());
    }

    /* 게시판 전체 목록 */
//    @Test
    public void getListTest(){
        log.info("---------------------------------------------");
        log.info("DAO get List........................");
        log.info("---------------------------------------------");

        Criteria criteria = new Criteria();
        criteria.setType("C");
        criteria.setKeyword("study");

        postDAO.getList(criteria);
    }

    /* 게시글 수정 */
    @Test
    public void modifyOkTest(){
        log.info("---------------------------------------------");
        log.info("DAO modifyOk........................");
        log.info("---------------------------------------------");

        PostVO postVO = new PostVO();
        postVO.setPostTitle("수정테스트");
        postVO.setPostContent("수정DAO test");
        postVO.setPostNumber(44);

        postDAO.postUpdate(postVO);
    }

}
