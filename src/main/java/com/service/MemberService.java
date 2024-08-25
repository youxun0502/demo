package com.service;

import org.springframework.stereotype.Service;

import com.dao.Member;

@Service
public interface MemberService {

	Member findMemberById(String id);
}
