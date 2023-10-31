package oop

import B

class Authentication:A,B {
    override fun studentLogin() {
        println("i can login as a student")
    }

    override fun studentLogout() {
        println("i can logout as a student")
    }

    override fun adminLogin() {
        println("i can login as an admin")

    }

    override fun adminLogout() {
        println("i can logout as an admin")
    }
}