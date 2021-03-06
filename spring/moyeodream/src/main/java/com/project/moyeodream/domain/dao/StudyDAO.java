package com.project.moyeodream.domain.dao;

import com.project.moyeodream.domain.vo.*;
import com.project.moyeodream.mapper.StudyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudyDAO {
    private final StudyMapper studyMapper;

    // 전체 스터디 목록
    public List<StudyDTO> getList(Criteria criteria){
        return studyMapper.getList(criteria);
    }
    // 전체 스터디 목록 - 인기
    public List<StudyDTO> getListView(Criteria criteria){
        return studyMapper.getListView(criteria);
    }
    // 전체 스터디 목록 - 최신
    public List<StudyDTO> getListLatest(Criteria criteria){
        return studyMapper.getListLatest(criteria);
    }

    // 승인된 스터디 목록
    public List<StudyVO> getApproveList(){
        return studyMapper.getApproveList();
    }

    // 스터디 조회
    public StudyDTO read(int studyNumber) {
        return studyMapper.select(studyNumber);
    }

    // 스터디 만든 회원의 닉네임 찾기
    public MemberVO findMemberInfo(int studyMemberNumber) {
        return studyMapper.selectMemberInfo(studyMemberNumber);
    }

    // 내가 만든 스터디 목록
    public List<StudyVO> CratedList(int userNumber) { return studyMapper.CratedList(userNumber); }

    // 내가 참여중인 스터디 목록
    public List<StudyVO> participatingList(int userNumber) {  return studyMapper.participatingList(userNumber); }

    // 스터디 작성
    public void register(StudyVO studyVO) {
        studyMapper.insert(studyVO);
    }

    // 스터디 수정
    public void update(StudyVO studyVO) {
        studyMapper.update(studyVO);
    }

    // 스터디 삭제
    public void delete(int studyNumber) {
        studyMapper.delete(studyNumber);
    }

    // 조회수 올리기
    public void views(int studyNumber) {
        studyMapper.views(studyNumber);
    }

    // 카테고리 별 스터디
    public List<StudyVO> getCategoryList(String studyCategory){
        return studyMapper.getCategoryList(studyCategory);
    }

    // 스터디 승인
    public boolean approve(int studyNumber){
        return studyMapper.approve(studyNumber);
    }

    // 스터디 거절
    public int refuse(int studyNumber){
        return studyMapper.refuse(studyNumber);
    }


    
    // 스터디 10개 항목
    public List<StudyVO> getApproveWait() { return studyMapper.getApproveWait(); }

    // 스터디 가져오기 admin
    public List<StudyDTO> getStudyList(Criteria criteria) { return studyMapper.getStudyList(criteria); }

    // 스터디 전체 개수(댓글에서 사용)
    public int getTotal(Criteria criteria){
        return studyMapper.getTotal(criteria);
    }

    // 스터디 전체 개수
    public int getTotalC(Criteria criteria){
        return studyMapper.getTotalC(criteria);
    }

    // 승인 여부 확인
    public int getApprove(int studyNumber){return studyMapper.getApprove(studyNumber);}

    // 채용공고 체크하기
    public void check(int studyNumber){studyMapper.check(studyNumber);}
}
