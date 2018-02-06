/**
 * Created by pallavi on 6/2/18.
 */
trait UserOperationTrait {
  def addNewUser(user: User): Map[Int,User]
  def authenticateUser(id:Int, userName: String,password: String): Int

}
