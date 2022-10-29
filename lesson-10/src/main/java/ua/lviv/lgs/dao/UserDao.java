package ua.lviv.lgs.dao;

import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.shared.AbstractCRUD;
// dao for user
public interface UserDao extends AbstractCRUD<User>{
	User getUserByEmail(String email);
}
