package service.impl;

import Dao.UserDao;
import Dao.impl.UserDaoimpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	//ҵ���������ݷ��ʲ������
	UserDao dao =new UserDaoimpl();
	@Override
	public void save(User user) {
		//ʹ�����ݷ��ʲ��е��࣬�������ķ�����ʵ�����ݵ����
		dao.save(user);
		
	}

}
