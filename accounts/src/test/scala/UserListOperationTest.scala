import org.scalatest.FlatSpec

class UserListOperationTest extends FlatSpec {
  val user1 = User("mona",45675,"m19","pwd")
  val user2 = User("jas",6567,"j20","pwd")
  val testClass = UserListOperation(Map(user1.contactNumber->user1))

  "Add new user method" should "add a new user" in {
    val result = testClass.addNewUser(user2)
    assert(result.contains(user1.contactNumber))
  }
  it should "not add an already Existing user" in{
    val result = testClass.addNewUser(user1)
    assert(!result.contains(98876))
  }

  "Authenticate use" should "authenticate a valid user" in {
    val result = testClass.authenticateUser(user1.contactNumber,"m19","pwd")
    assert(result != -1 )
  }

  it should "not authenticate an invalid user" in {
    val result = testClass.authenticateUser(user1.contactNumber,"m19","abf")
    assert(result == -1 )
  }



}
