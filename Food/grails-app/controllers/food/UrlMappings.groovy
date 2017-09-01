package food

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/register"(view:"/user/create")
	"/welcome"(controller:'home' , action: 'login')
	"/similar"(controller:'home' , action: 'similar')
	"/nuser"(controller:'home' , action: 'newUser')
        "/bye"(controller:'home' , action: 'logout')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
