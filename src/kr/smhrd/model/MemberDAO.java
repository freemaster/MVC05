package kr.smhrd.model;

import java.util.List;

public interface MemberDAO {
	public List<MemberVO> memberList(); //회원 전체 목록
	public int memberInsert(MemberVO vo); //회원 가입
	public int memberDelete(int num); //회원삭제
	public MemberVO memberContent(int num); //회원정보 보기
	public int memberUpdate(MemberVO vo); //회원정보 수정
}
