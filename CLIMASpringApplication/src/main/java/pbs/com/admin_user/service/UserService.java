package pbs.com.admin_user.service;

import pbs.com.admin_user.dto.UserDto;
import pbs.com.admin_user.model.User;

public interface UserService {
	
	User save (UserDto userDto);
	

}
