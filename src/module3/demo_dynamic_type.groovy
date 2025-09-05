package module3

class demo_dynamic_type {
    static void main(String[] args) {
        def cardName = "VISA"
        def cardLength = 16
        def cardLastThree = 3

        println("All $cardName cards have $cardLength digits")
        print(cardLength+cardName) //16VISA type cast same as JavaScript
        assert cardLength + cardLastThree == 13 : 'Error'
    }
}
