package hello.world

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the controller says hi"() {

        when:
        controller.index()

        then:
        response.text == 'Hello MrMat!'
    }
}
