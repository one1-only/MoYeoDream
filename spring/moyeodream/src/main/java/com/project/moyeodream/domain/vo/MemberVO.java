package com.project.moyeodream.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MemberVO {
    private Integer memberNumber;               // 멤버 고유번호(DB SEQUENCE 사용)
    private String memberEmail;                 // 멤버 이메일
    private String memberNickname;              // 멤버 닉네임
    private String memberInterests;             // 멤버 관심분야
    private String memberProfile;               // 멤버 프로필 이미지
    private Integer memberStudyNumber;          // 멤버가 참여하고 있는 스터디 번호
}
