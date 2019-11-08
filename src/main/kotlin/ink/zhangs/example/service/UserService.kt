package com.example.demo.service

import ink.zhangs.example.model.User

/**
 * @author: zhangs
 * @date: 2019/10/12 16:49
 */
interface UserService {
    fun get(userId: Long): User
    fun select(): List<User>
    fun save(user: User):User
    fun del(userId: Long)
}