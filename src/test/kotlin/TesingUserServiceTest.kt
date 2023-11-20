import io.mockk.every
import io.mockk.mockk
import learn.ghar.spring.revise.tests.User
import learn.ghar.spring.revise.tests.UserRepository
import learn.ghar.spring.revise.tests.UserService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestingUserServiceTest {

    @Test
    fun `should get all Users from the Repository`(){

        val mockkRepo = mockk<UserRepository>()
        every { mockkRepo.getAll() }.returns(listOf(User(1), User(50)))

        val service = UserService(mockkRepo)
        val users = service.getAllUsers()

        Assertions.assertEquals(2, users.size)      // fails if something changes to .getAllUsers() call in actual call
    }
}

/**
 * Manual mocking approach using interfaces
class MockRepository : UserRepository {
    override fun get(id: Int): User {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<User> {
        return listOf(User(1), User(10))
    }
}
*
 * */
