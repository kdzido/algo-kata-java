package eu.itere.kata.algo

import spock.lang.Specification


class AlgoMainTest extends Specification {

    def "should be always true"() {
        expect:
        AlgoMain.TRUTH == true
    }

}
