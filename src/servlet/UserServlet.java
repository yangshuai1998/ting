package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;
/*
 * �����û���Ϣ��servlet
 */
//���÷���URL��Ϣ���������ע��
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//����һ���������ݵı���
		req.setCharacterEncoding("UTF-8");
		// ��servlet��ȥ����service�е�����
		UserService us = new UserServiceImpl();
		User user =new User();
		//���ҳ���ϵ�����
		String name=req.getParameter("name");
		//ҳ���ϻ�õ��������ݶ���String���ͣ���������int����
		//��������������Ҫ�������ݽ���ǿת����װ�ࣩ
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//����ʵ�����е�setter����λ˽�е����Ը�ֵ
		user.setAge(age);
		us.save(user);
	}

}
