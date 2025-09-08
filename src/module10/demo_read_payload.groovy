package module10

import groovy.json.JsonSlurper
import groovy.xml.XmlSlurper

class demo_read_payload {
    static void main(String[] args) {
//        File xml = new File("test.xml")
//        XmlSlurper slurper = new  XmlSlurper()
//        def cards = slurper.parse(xml)

//        println("First card name is ${cards.card.name[0]}")
//        println("Second Card Monzo has ${cards.card.digit[1]} digits")


        File json = new File("test.json")
        JsonSlurper jsSlurper = new JsonSlurper()
        def jsCards = jsSlurper.parse(json)

        println("First card name is ${jsCards.cards[0]}")

    }
}
