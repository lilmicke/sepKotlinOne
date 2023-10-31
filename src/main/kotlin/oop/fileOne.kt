package oop

fun main(args: Array<String>) {
    var carOne=Car("TOYOTA-V8","GRAY","KDM908J","KSH 9,500,00")
    var carTwo=Car("AUDI","BLACK","KDG938J","KSH 10,500,00")
    println(carTwo.color)


    var flowerOne = Flower("Rose","Natural","1500")
    println(flowerOne.name)

    var userOne = User("Mickey","email@gmail.com","12345")
    userOne.login()

    userOne.setPhoneNumber("0700000000")
    println(userOne.getPhoneNumber())


    var personOne =Person("Mickey")
    personOne.setage("21")
    println(personOne.getage())
    println(personOne.name)

    personOne.setbloodgroup("AB+")
    println(personOne.getbloodgroup())
    personOne.login()

    var personTwo= personOne.copy()
    println(personTwo.name)

var adminOne = Admin("King","king@test.com","1234")
    adminOne.getPhoneNumber()
    adminOne.suspendUser()


    var superAdminOne=SuperAdmin("john","john@test.com","2345")
    superAdminOne.login()
    superAdminOne.suspendAdmin()
    superAdminOne.suspendUser()


    var mcaOne =Mca("King","king@test.com","1234")
    mcaOne.login()
    mcaOne.register()


    var governorOne=Governor("king","king@test.com","123")
    governorOne.allstudents()

}

