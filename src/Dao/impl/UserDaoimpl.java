package Dao.impl;

import java.util.ArrayList;
import java.util.List;

import Dao.UserDao;
import entity.User;

public class UserDaoimpl  implements UserDao {

	@Override
	public void save(User user) {
			//����һ�������������û���Ϣ
			List<User>list =new ArrayList<User>();
			list.add(user);
			for(User user2:list) {
				System.out.println(user2.getName()+","
						+user2.getAge());
			}	
	}
	
	@Override
	public void update(User user) {
		System.out.println("ִ���޸��û���Ϣ�Ĳ���");
	}



}


