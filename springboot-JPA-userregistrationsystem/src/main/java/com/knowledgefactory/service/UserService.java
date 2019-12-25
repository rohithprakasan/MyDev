package com.knowledgefactory.service;

import java.util.ArrayList;
import java.util.List;

import com.knowledgefactory.VO.UserVo;

public interface UserService {

	
	List<UserVo> getAllUsers();
	String save(UserVo vo);
	String delete(Long id);
	String update(UserVo vo);
	ArrayList<UserVo> getAllUser();
	
}
