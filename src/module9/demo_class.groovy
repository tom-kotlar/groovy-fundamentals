package module9

class Card {
    String name
    int num_dig

    Card() {
        println("Constructor")
    }

    Card(String cardName, int numberOfDigits) {
        name = cardName
        num_dig = numberOfDigits
        println("Class parameter overload")
    }

    int getTotalDigits() {
        int lastThree = 3
        num_dig+lastThree
    }
}

class ChipCard extends Card {
   static void getMicroChipInfo() {
        println("Microchip details")
    }
}

//Card Card1 = new Card()
Card card1 = new Card("Visa", 16)
println("Total number of digits: ${card1.getTotalDigits()}")

ChipCard card2 = new ChipCard()
card2.getMicroChipInfo()
