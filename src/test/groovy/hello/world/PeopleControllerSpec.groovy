package hello.world

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PeopleController)
@Mock(Person)
class PeopleControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "succeed listing people"() {
        when:
        controller.index()

        then:
        Person.count() == 0
    }

    void "succeed creating a Person"() {

        when:
        params.name = 'foo'
        params.surname = 'bar'
        controller.save()

        then:
        response.redirectedUrl == '/people/index'
        Person.count() == 1
    }

    void "succeed updating an existing Person"() {
        when:
        def p = new Person(name: 'foo', surname: 'bar')
        p.save(flush: true)
        params.id = 1
        params.name = 'Mr'
        params.surname = 'Mat'
        controller.update()

        then:
        response.redirectedUrl == '/people/index'
        Person.count() == 1
        def u = Person.findBySurname('Mat')
        u.name == 'Mr'
        u.surname == 'Mat'
    }

    void "succeed removing an existing Person"() {
        when:
        def p = new Person(name: 'foo', surname: 'bar')
        p.save(flush: true)
        params.id = 1
        controller.delete()

        then:
        response.redirectedUrl == '/people/index'
        Person.count() == 0
    }

}
