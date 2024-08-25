package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Member;
import com.dao.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository;

	@Override
	public Member findMemberById(String id) {
		Optional<Member> member = memberRepository.findById(id);
		return member.get();
	}

}
