package food

class HomeController {

    def t
    def list = ""
    def f_email , f_password

    def index() {
      if(session.getAttribute("name") == null){
          render(view: "index")
      }else {
        render(view: '/home/homepage', model: [name: session.getAttribute("name")])
      }

    }


    def login(String email , String password){
        f_email = email
        f_password = password
      def  u = User.findByEmailAndPassword(email,password)
      //println(u.genres.last())

      if(u){
       // println("here man 1"+ u.genres )
        session.setAttribute("name",u.name)
        if(u.newU == 0){
          u.newU = 1
          u.save(flush:true)


          redirect(url: "http://localhost:8080/nuser")
        }

        render(view: '/home/homepage', model: [name: u.name])
      }else {
        flash.message = "User not found"

        render(view: "index")
      }
    }
    
    def similar(String query){
            t = new FoodService()
            def json = "nothing"
            t.similar(query)
            
            
            try {
              json = t.similar(query).results
            }catch(Exception e){
              e.printStackTrace()
            }
    
            render(view: 'homepage', model: [name: session.getAttribute("name"), url: json ])
    }

    def logout() {
    	session.invalidate()
      f_email = null
      f_password = null
      list = ""
      redirect(url: "http://localhost:8080")
    }
}