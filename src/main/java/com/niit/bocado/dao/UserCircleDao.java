package com.niit.bocado.dao;

import java.util.List;

public interface UserCircleDao {
	boolean addUserToCircle(String emailId,String circleName);
	boolean deleteUserFromCircle(String emailId,String circleName);
    List<String> getUserOfCircle(String circleName);
}
