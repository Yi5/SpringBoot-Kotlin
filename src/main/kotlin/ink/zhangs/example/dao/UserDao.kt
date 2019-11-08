package ink.zhangs.example.dao

import ink.zhangs.example.model.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author: zhangs
 * @date: 2019/10/12 16:48
 */
interface UserDao:JpaRepository<User,Long>