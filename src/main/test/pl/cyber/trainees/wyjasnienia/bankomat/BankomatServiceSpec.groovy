package pl.cyber.trainees.wyjasnienia.bankomat


import spock.lang.Specification


class BankomatServiceSpec extends Specification {

    private BankomatService underTest = new BankomatService()
    private Bankomat bankomat

    void setup() {
        bankomat = Mock()
    }

    def "Sprawdzam wybraną pozycję nr 0 tj. Przerwij operacje"() {
        when:

        def result = underTest.menu2(0, null)

        then:
        noExceptionThrown()
//        result == false
        !result
    }

    def "Powinnien dokonac wplaty gotowki"() {
        given:
            bankomat.stanKonta() >> 50 // poprzez 2 znaki większości dokonujemy mockowania metod
            def karta = new Karta(1234,1234,1000)

        when:
            underTest.dokonajWplaty(50,karta)


        then:
        noExceptionThrown()
        bankomat.stanKonta() == 50
        karta.stanKonta() == 1050
    }

    def "Sprawdzam pozycję 1 tj. wpłatę gotówki."() {
        given:
        def bankomat = new Bankomat()
        bankomat.wplacGotowke(100)
        def karta = new Karta(123456, 1234, 1000)


        when:
        def result = underTest.dokonajWplaty(50,karta)

        then:
        noExceptionThrown()
        result

        bankomat.stanKonta() == 50
        karta.stanKonta() == 1050
    }

    def "Sprawdzam pozycję 2 tj. wypłatę gotówki."() {
        given:
        def bankomat = new Bankomat()
        bankomat.wplacGotowke(100)
        underTest = new BankomatService(bankomat)
        def karta = new Karta(123456, 1234, 1000)


        when:
        underTest.dokonajWyplaty(50,karta)

        then:
        noExceptionThrown()

        bankomat.stanKonta() == 50
        karta.stanKonta() == 1050
    }

    def "Powinien dokonać wypłaty gotówki"() {
        given:
        def karta = new Karta(1234, 1234,1000)
        def bankomat = new Bankomat()
        underTest = new BankomatService(bankomat)
        bankomat.wplacGotowke(1000)
        when:
        underTest.dokonajWyplaty(50, karta)

        then:
        noExceptionThrown()
        bankomat.stanKonta() == 950
        karta.stanKonta() == 950
    }
    def "Wyswietlenie pozycji 3 z menu 2" () {
        given:
        def karta = new Karta(1234, 1234,1000)
        def bankomat = new Bankomat()
        underTest = new BankomatService(bankomat)
        bankomat.wplacGotowke(1000)
        when:
        underTest.menu2(3,karta)
        then:
        noExceptionThrown()
        bankomat.stanKonta() == 1000
    }
}