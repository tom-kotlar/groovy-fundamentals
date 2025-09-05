package module4

class demo_if_else {
    static void main(String[] args) {
        String[] cardName = ["visa", "maestro", "american express", "amex", "apple"]
        int size = cardName.size()
        println(size)
        if (size == 4) {
            println("We have $size cards")
        } else if (size == 5) {
            println("We have $size cards")
        } else {
            println("Something is wrong")
        }
    }
}
