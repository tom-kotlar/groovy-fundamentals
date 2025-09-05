package module10

import groovy.xml.MarkupBuilder

class demo_markup_builder {
    static void main(String[] args) {
        MarkupBuilder builder = new MarkupBuilder(new PrintWriter("test.xml"))
        MarkupBuilder htmlBuilder = new MarkupBuilder(new PrintWriter("test.html"))
        builder.cards {
            card(cardnum:1){
                name ("visa")
                digit (16)
            }
            card(cardnum:2){
                name "monzo"
                digit 15
            }
        }


        htmlBuilder.cardList  {
            head {
                title "list of cards"
            }
            body {
                h1 "Testing HTML writer"

                table {
                    tr {
                        th "Card Name"
                        th "Card Digits"
                    }
                    tr {
                        td "visa"
                        td 15
                    }
                    tr {
                        td "monzo"
                        td 14
                    }

                }
            }

        }
    }
}

