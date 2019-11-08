package ink.zhangs.example.service.impl

import com.example.demo.service.UserService
import ink.zhangs.example.dao.UserDao
import ink.zhangs.example.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author: zhangs
 * @date: 2019/10/12 16:51
 */
@Service
class UserServiceImpl:UserService {

    @Autowired
    private lateinit var userDao: UserDao

    override fun get(userId: Long): User {
       return userDao.findById(userId).get()
    }

    override fun select(): List<User> {
        return userDao.findAll()
    }

    override fun save(user: User): User {
        return userDao.save(user)
    }

    override fun del(userId: Long) {
        userDao.deleteById(userId)
    }
}