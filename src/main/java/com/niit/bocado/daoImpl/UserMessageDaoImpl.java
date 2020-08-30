package com.niit.bocado.daoImpl;

import java.util.List;

import com.niit.bocado.dao.UserMessageDao;
import com.niit.bocado.model.UserMessage;

public class UserMessageDaoImpl implements UserMessageDao {

	@Override
	public boolean sendMessage(UserMessage usrmessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMessage(int messageId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserMessage> getMyMessages(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserMessage> getAllMessageByCircleName(String circleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReceiverExists(String receiverEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCircleExists(String circleName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserMessage> getAllMessageByUsers(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
