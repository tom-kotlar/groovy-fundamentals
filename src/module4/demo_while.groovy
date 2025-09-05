package module4

class demo_while {
    static void main(String[] args) {
        String[] cards = ["visa", "master", "amex", "maestro", "monzo"]
        int counter = 0

        while (counter < 4) {
            println("name of the card ${cards[counter]}")
            counter++
        }

        counter = 0

        do {
            println("name of the card ${cards[counter]}") //Visa
            counter++
        } while (counter < 0) // <-

    }
}
