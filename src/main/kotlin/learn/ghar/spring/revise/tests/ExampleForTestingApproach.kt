package learn.ghar.spring.revise.tests

class DataBase

open class Repository(val dataBase: DataBase)

class UserRepository(dataBase: DataBase) : Repository(dataBase){
    fun get(id: Int) : User {
        return User(3)
    }

    fun getAll() : List<User> {
        return listOf(User(20), User(1))
    }
}

class UserService(val userRepository: UserRepository){
    fun getUser(id: Int) : User {
        return userRepository.get(id)
    }

    fun getAllUsers() : List<User> {
        return userRepository.getAll()
    }
}

class User(id: Int)