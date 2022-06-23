package com.project.moyeodream.domain.dao;

import com.project.moyeodream.domain.vo.StudyCommentVO;
import com.project.moyeodream.mapper.StudyCommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudyCommentDAO {
    private StudyCommentMapper studyCommentMapper;

    // 댓글 작성
    public void studyCommentRegister(StudyCommentVO studyCommentVO){
        studyCommentMapper.insert(studyCommentVO);
    }

    // 댓글 수정
    public boolean studyCommentUpdate(StudyCommentVO studyCommentVO){
        return studyCommentMapper.update(studyCommentVO) == 1;
    }

    // 댓글 삭제
    public boolean studyCommentDelete(int studyCommentNumber){
        return studyCommentMapper.delete(studyCommentNumber) == 1;
    }

    // 전체 댓글 목록
    public List<StudyCommentVO> studyCommentList(){
        return studyCommentMapper.getlist();
    }

}