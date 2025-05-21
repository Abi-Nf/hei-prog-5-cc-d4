package com.project.clean

class UserRepository {
    companion object {
        val users = mapOf(
            "1" to "Julien",
            "2" to "Rajerison",
            "3" to "Jul"
        )
    }

    fun findUser(id: String): String? {
        return users[id]
    }

    fun getUserById(id: String): String {
        return findUser(id) ?: throw UserNotFoundException("User with $id not found !")
    }
}