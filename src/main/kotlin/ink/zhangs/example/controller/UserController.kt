package ink.zhangs.example.controller

import com.example.demo.service.UserService
import ink.zhangs.example.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author: zhangs
 * @date: 2019/10/12 16:38
 */
@RestController
class UserController {

    @Autowired
    private lateinit var userService: UserService

    /**
     * 获取单个
     */
    @GetMapping("getById")
    fun getById(userId:Long): User {
        return userService.get(userId)
    }

    /**
     * 获取列表
     */
    @GetMapping("select")
    fun select(): List<User> {
        return userService.select()
    }

    /**
     * 保存（更新）
     */
    @PostMapping("save")
    fun save(user:User):User{
        return userService.save(user)
    }

    /**
     * 删除
     */
    @PostMapping("del")
    fun del(userId: Long){
        userService.del(userId)
    }

}