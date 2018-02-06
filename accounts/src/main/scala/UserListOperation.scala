

/**
 * Created by pallavi on 6/2/18.
 */
case class UserListOperation(registeredUsers: Map[Int, User]) extends UserOperationTrait {


  override def toString(): String = s"$registeredUsers\n"

  def addNewUser(user: User): Map[Int,User]= {
    registeredUsers + (user.contactNumber  ->user)
  }

  def authenticateUser(id:Int, userName: String, password: String):Int ={
    val user = registeredUsers(id)
    if(user.userName == userName && user.password == password) {
     val r = new scala.util.Random
      r.nextInt(50)
    }
    else -1
  }

}


