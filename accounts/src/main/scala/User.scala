/**
 * Created by manjot on 6/2/18.
 */
case class User(name: String, contactNumber: Int,userName: String,password: String) {

  override def toString(): String = s"$name $contactNumber $userName"
}