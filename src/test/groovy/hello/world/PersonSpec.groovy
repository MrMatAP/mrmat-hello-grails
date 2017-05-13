package hello.world

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "succeed creating a Person"() {

        when:
        def p = new Person(name: 'Foo', surname: 'Bar')
        p.save(flush: true)

        then:
        def s = Person.findBySurname('Bar')
        s != null
        Person.count() == 1
    }

    void "fail creating a Person without a name"() {

        when:
        def p = new Person(surname: 'Mat')
        p.save(flush: true)

        then:
        def s = Person.findBySurname('Mat')
        s == null
        Person.count() == 0
    }

    void "fail creating a Person without a surname"() {

        when:
        def p = new Person(name: 'Mr')
        p.save(flush: true)

        then:
        def s = Person.findByName('Mr')
        s == null
        Person.count() == 0
    }
}
