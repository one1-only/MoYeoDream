package com.project.moyeodream.service;

import com.project.moyeodream.domain.dao.StudyDAO;
import com.project.moyeodream.domain.vo.StudyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("study")
public class StudyServiceImpl implements StudyService{
    private final StudyDAO studyDAO;

    @Override
    public List<StudyVO> getList() {
        return studyDAO.getList();
    }

    @Override
    public List<StudyVO> getApproveList() {
        return studyDAO.getApproveList();
    }

    @Override
    public StudyVO studyRead(int studyNumber) {
        return studyDAO.studyRead(studyNumber);
    }

    @Override
    public List<StudyVO> CratedList(int userNumber) {
        return studyDAO.CratedList(userNumber);
    }

    @Override
    public List<StudyVO> participatingList(int userNumber) {
        return studyDAO.participatingList(userNumber);
    }

    @Override
    public void register(StudyVO studyVO) {
        studyDAO.register(studyVO);
    }

    @Override
    public boolean modify(StudyVO studyVO) {
        return studyDAO.update(studyVO);
    }

    @Override
    public boolean remove(int studyNumber) {
        return studyDAO.delete(studyNumber);
    }

    @Override
    public List<StudyVO> getCategoryList(String studyCategory) {
        return studyDAO.getCategoryList(studyCategory);
    }

    @Override
    public int approve(int studyNumber) {
        return 0;
    }

    @Override
    public int refuse(int studyNumber) {
        return 0;
    }
}