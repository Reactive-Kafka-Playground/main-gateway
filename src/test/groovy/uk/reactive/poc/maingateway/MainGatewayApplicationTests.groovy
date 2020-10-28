package uk.reactive.poc.maingateway

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification
import uk.reactive.poc.maingateway.controller.MainGatewayController

@SpringBootTest
class MainGatewayApplicationTests extends Specification{
    @Autowired
    ApplicationContext applicationContext

    def contextLoads() {
        when:
        def controller = applicationContext.getBean(MainGatewayController.class)

        then:
        controller
    }

    def failme(){
        expect:
        0 == 0 // todo mc, replace with 1==0 to make sure tests are run
    }

}
