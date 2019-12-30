package com.knowledgefactory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledgefactory.Entity.User;
import com.knowledgefactory.Repository.UserRepository;
import com.knowledgefactory.VO.UserVo;
import com.knowledgefactory.utility.MailServices;
import com.knowledgefactory.utility.Sms;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;

	@Autowired
	Sms sms;

	@Autowired
	MailServices mail;
	
	@Override
	public List<UserVo> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userList = (List<User>) repository.findAll();
		List<UserVo> vo = new ArrayList<>();
		for (User users : userList) {
			UserVo obj = new UserVo();
			obj.setId(users.getId());
			obj.setName(users.getName());
			obj.setLastname(users.getLastname());
			obj.setEmail(users.getEmail());
			obj.setPin(users.getPin());
			vo.add(obj);
		}
		return vo;
	}

	@Override
	public String save(UserVo vob) {

		User u = new User();
		u.setEmail(vob.getEmail());
		u.setLastname(vob.getLastname());
		u.setName(vob.getName());
		u.setPin(vob.getPin());
		repository.save(u);

		mail.sendMail(vob.getEmail());
		sms.sendSms("8098987", "sdwsdsdsds");

		return "true";

	}

	@Override
	public String delete(Long id) {
		repository.deleteById(id);
		return "true";
	}

	@Override
	public String update(UserVo vob) {
		User u = new User();
		u.setEmail(vob.getEmail());
		u.setLastname(vob.getLastname());
		u.setName(vob.getName());
		u.setPin(vob.getPin());
		u.setId(vob.getId());
		repository.save(u);
		return "true";
	}

	@Override
	public ArrayList<UserVo> getAllUser() {
		ArrayList<User> u = new ArrayList<>();
		u = repository.findAllActiveUsersNative();

		ArrayList<UserVo> voList = new ArrayList<UserVo>();

		for (User user : u) {

			UserVo vo = new UserVo(user.getId(), user.getName(),
					user.getLastname(), user.getEmail(), user.getPin());
			voList.add(vo);
		}

		return voList;

	}

}
