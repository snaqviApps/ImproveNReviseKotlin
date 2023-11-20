package learn.ghar.spring.revise.tests

class DataBase

interface Repository

interface UserRepository : Repository {
    fun get(id: Int) : User
    fun getAll() : List<User>
}

open class SqlRepository(val dataBase: DataBase) : Repository

class SqlUserRepository(dataBase: DataBase) : SqlRepository(dataBase), UserRepository {
    override fun get(id: Int) : User {
        return User(3)
    }

    override fun getAll() : List<User> {
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