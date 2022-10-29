package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.shared.AbstractCRUD;
//it is service for user
public interface UserService extends AbstractCRUD<User>{
	User getUserByEmail(String email);
}
