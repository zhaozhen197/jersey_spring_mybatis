package cn.zanezz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.zanezz.dao.UserDao;
import cn.zanezz.entity.User;
import cn.zanezz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    public int addUser(User user) {
        return this.userDao.addUser(user);
    }

    public int delUser(int id) {
        return this.userDao.delUser(id);
    }

    public int update(User user) {
        return this.userDao.update(user);
    }

    public User findById(int id) {
        return this.userDao.findById(id);
    }

    public List<User> findAll() {
        return this.userDao.findAll();
    }

    public PageInfo<User> getUserList(int pageNum, int pageSize, String name, int age) {

        if (pageNum < 1) {
            pageNum = 1;
        }
        if (pageSize < 1) {
            pageSize = 4;
        }
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(pageNum, pageSize);
        List<User> userList = this.userDao.find(name, age);
        return new PageInfo<User>(userList);
    }

}
