package org.huamuzhen.dal.dao;

import org.huamuzhen.domain.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaDAO<User, String> {


}
