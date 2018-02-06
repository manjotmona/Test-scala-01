/**
 * Created by manjot on 6/2/18.
 */
case class User(name: String, contactNumber: Int, userName: String, password: String) {

  override def toString(): String = s"$name $contactNumber $userName"

  def authenticateSingleUser(userName: String, password: String): Int = {
    if (this.userName == userName && this.password == password) {
      val r = new scala.util.Random
      r.nextInt(50)
    }
    else {
      -1
    }
  }
}
