package food


class User {

  String name
  String gender
  String email
  String password
  int age
  int id
  int newU
  String foods

    static mapping = {
      newU defaultValue: 1
    }

    static constraints = {
      name maxSize: 233
   		gender maxSize: 1
   		email maxSize: 64 , unique: true
   		password maxSize: 64
   		age nullable: true
      foods maxSize: 255 , nullable:true
      newU maxSize:8 , nullable:true
    }
}