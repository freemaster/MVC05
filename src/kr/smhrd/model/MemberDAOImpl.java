package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAOImpl implements MemberDAO{
    
    /* My Batis Start
     * 객체가 한번만 실행되는 것
     * 초기화 블럭 (객체를 생성할 때)
     * My Batis 
     */
    private static SqlSessionFactory sqlSessionFactory;
    
    static {
        String resource = "kr/smhrd/mybatis/config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            //전체 세션을 관리하는 것이 sqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<MemberVO> memberList() {
        //세션정보 가져오기
        SqlSession session = sqlSessionFactory.openSession();
        //SQL문장 ( select ~ ) + MemberVO + ArrayList() 
        //List<MemberVO> list = session.selectList("kr.smhrd.mybatis.memberList"); //동일한 이름이 없을 경우 패키지는 적지 않아도 된다.
        List<MemberVO> list = session.selectList("memberList");
        //사용후 사용한 세션에 대한 반납을 실시한다.
        session.close();
        return list;
    }

    @Override
    public int memberInsert(MemberVO vo) {
        SqlSession session = sqlSessionFactory.openSession();
        int cnt = session.insert("memberInsert", vo);
        session.commit();
        session.close();
        return cnt;
    }

    @Override
    public int memberDelete(int num) {
        SqlSession session = sqlSessionFactory.openSession();
        int cnt = session.delete("memberDelete", num);
        session.commit();
        session.close();
        return cnt;
    }

    @Override
    public MemberVO memberContent(int num) {
        SqlSession session = sqlSessionFactory.openSession();
        MemberVO vo = session.selectOne("memberContent", num);
        session.close();
        return vo;
    }

    @Override
    public int memberUpdate(MemberVO vo) {
        SqlSession session = sqlSessionFactory.openSession();
        int cnt = session.update("memberUpdate", vo);
        session.commit();
        session.close();
        return cnt;
    }

}
