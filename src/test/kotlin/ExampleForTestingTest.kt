import learn.ghar.spring.revise.tests.DataBase
import learn.ghar.spring.revise.tests.UserRepository
import learn.ghar.spring.revise.tests.UserService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class ExampleForTestingTest {

    @Test
    fun `should get all Users from the Repository`(){

        val database = DataBase()

        val userRepository = UserRepository(database)
        val service = UserService(userRepository)
        val users = service.getAllUsers()

        Assertions.assertEquals(1, users.size)      // fails if something changes to .getAllUsers() call in actual call
    }
}