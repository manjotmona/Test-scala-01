import scala.io.StdIn
import scala.concurrent.ExecutionContext.Implicits.global

import com.knolkart.Api
import com.knolkart.modules.User
import com.knolkart.operations.UserListOperation
import org.apache.log4j.Logger

/**
 * Created by pallavi on 6/2/18.
 */
object Application extends {
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
    val newRegisteredUsers = registeredUsers map {x=> UserListOperation(x)}
    newRegisteredUsers map { x=>
      val token = x.authenticateUser(newUser.contactNumber, userID, userPwd)
      token map{ y=>
      if (y == -1) {
        logObject.info("Invalid com.knolkart.modules.User")
      }
      else {
        logObject.info("a token successfully generted for the user")
      }
      }
    }

    Thread.sleep(100000)
  }
}
