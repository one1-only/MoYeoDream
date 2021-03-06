package com.project.moyeodream.domain.dao;

import com.project.moyeodream.domain.vo.Criteria;
import com.project.moyeodream.domain.vo.JobpostingDTO;
import com.project.moyeodream.domain.vo.JobpostingVO;
import com.project.moyeodream.mapper.JobpostingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JobpostingDAO {

    private final JobpostingMapper jobpostingMapper;

    // 전체 채용 공고 목록
    public List<JobpostingDTO> getList(Criteria criteria){
        return jobpostingMapper.getList(criteria);
    }
    
    // 전체 채용 공고 목록 - 인기
    public List<JobpostingDTO> getListView(Criteria criteria){
        return jobpostingMapper.getListView(criteria);
    }
    
    // 전체 채용 공고 목록 - 최신
    public List<JobpostingDTO> getListLatest(Criteria criteria){
        return jobpostingMapper.getListLatest(criteria);
    }

    // 승인된 채용 공고 목록
    public List<JobpostingVO> getApproveList(){
        return jobpostingMapper.getApproveList();
    }

    // 채용 공고 상세 조회
    public JobpostingDTO jobpostRead(int jobpostingNumber){
        return jobpostingMapper.read(jobpostingNumber);
    }

    // 채용 공고 작성
    public void jobpostRegister(JobpostingVO jobpostingVO){
        jobpostingMapper.insert(jobpostingVO);
    }

    // 채용 공고 수정
    public boolean jobpostUpdate(JobpostingVO jobpostingVO){
        return jobpostingMapper.update(jobpostingVO) == 1;
    }

    // 채용 공고 삭제
    public boolean jobpostRemove(int jobpostingNumber){
        return jobpostingMapper.delete(jobpostingNumber) == 1;
    }

    // 조회수 증가
    public boolean jobpostVisit(int jobpostingNumber){
        return jobpostingMapper.visit(jobpostingNumber) == 1;
    }

    // 채용 공고 승인
    public boolean approve(int jobpostingNumber){
        return jobpostingMapper.approve(jobpostingNumber);
    }

    // 채용 공고 거절
    public boolean refuse(int jobpostingNumber){
        return jobpostingMapper.refuse(jobpostingNumber) == 1;
    }

    // 승인 대기 채용 공고
    public List<JobpostingVO> approveWait() { return jobpostingMapper.getApproveWait(); }

    // 채용 공고 가져오기 admin
    public List<JobpostingVO> getJobList(Criteria criteria) { return jobpostingMapper.getJobList(criteria); }

    // 채용 공고 전체 개수
    public int getTotal(Criteria criteria){
        return jobpostingMapper.getTotal(criteria);
    }

    // 채용 공고 상세 조회 관리자
    public JobpostingDTO adPostRead(int jobpostingNumber){
        return jobpostingMapper.read(jobpostingNumber);
    }

    // 승인 여부 확인
    public int getApprove(int jobpostingNumber){return jobpostingMapper.getApprove(jobpostingNumber);}

    // 채용공고 체크하기
    public void check(int jobpostingNumber){jobpostingMapper.check(jobpostingNumber);}
}
