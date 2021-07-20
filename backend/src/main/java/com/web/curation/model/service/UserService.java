package com.web.curation.model.service;

import java.util.Map;

import com.web.curation.model.Changepw;
import com.web.curation.model.UserVO;

public interface UserService {
	
	public boolean join(UserVO user) throws Exception;
	
	public UserVO login(Map map) throws Exception;
	
	public String checkid(Map map) throws Exception;
	
	public String checknickname(Map map) throws Exception;
	
	public boolean updateuser(UserVO user) throws Exception;
	
<<<<<<< HEAD
	public boolean updatepw(Map map) throws Exception;
	
	public String oldpw(Map map) throws Exception;
=======
	public boolean updatepw(Changepw changepw) throws Exception;
	
	public String oldpw(Changepw changepw) throws Exception;
>>>>>>> 45f6d2a50bd41fa48167cdf3a2e52f6e6130fa98

	public UserVO login(Map<String, String> map) throws Exception;
}
