package module4

class demo_for {
    static void main(String[] args) {
        String[] cards = ["visa", "master", "amex", "maestro", "monzo"]
        IntRange range = 1..5
//        for(card in cards) {
//            println("card name: $card" )
//        }

        for( number in range) {
            println("no: $number" )
        }

        for(int i = 0; i < 3; i++) {
//            println("NO: $i")
            println("First three cards ${cards[i]}")
        }
    }
}
