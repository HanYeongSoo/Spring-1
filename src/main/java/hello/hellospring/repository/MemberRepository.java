package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 회원 저장
    Member save(Member member);
    // Id로 찾기
    Optional<Member> findById(Long id); // null이 들어올 수 있잖아 그거 방지하려고 Optional사용
    // Name으로 찾기
    Optional<Member> findByName(String name);
    // 모든 회원 보기
    List<Member> findAll();

}
