/**
 * Created by pallavi on 6/2/18.
 */
class Api {
  val user1 = User("mona",45675,"m19","pwd")
  val userTraitApi : UserOperationTrait = UserListOperation(Map(user1.contactNumber ->user1))



}
