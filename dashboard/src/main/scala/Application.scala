import scala.io.StdIn

import org.apache.log4j.Logger

/**
 * Created by pallavi on 6/2/18.
 */
object  Application extends {
  def main(args: Array[String]): Unit = {
    val logObject = Logger.getLogger(this.getClass)
    val api = new Api
    //add credentials
    val newUser = User("Jas", 65778, "jas20", "jas")
    val registeredUsers = api.userTraitApi.addNewUser(newUser)
    logObject.info("Enter user id:")
    val userID = StdIn.readLine().toString
    logObject.info("Enter password:")
    val userPwd = StdIn.readLine().toString
    val newRegisteredUsers = UserListOperation(registeredUsers)
    val token = newRegisteredUsers.authenticateUser(newUser.contactNumber,userID,userPwd)
    if(token == -1)
      {
        logObject.info("Invalid User")
      }
    else {
      logObject.info("a token successfully generted for the user")

    }

  }
}
