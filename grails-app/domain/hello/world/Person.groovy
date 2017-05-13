package hello.world

class Person {

    String name
    String surname

    static constraints = {
        name blank:false
        surname blank:false
    }
}
