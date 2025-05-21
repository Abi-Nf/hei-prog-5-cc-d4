package com.project.clean

class Controller {
    private val repository = UserRepository()

    fun getCurrentUser(id: String) : String {
        return repository.getUserById(id);
    }
}
