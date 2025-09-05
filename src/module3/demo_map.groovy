package module3

class demo_map {
    static void main(String[] args) {
        def cardMap = [visa: 16, amax: 15, discover: 16]
        println("Visa card contains ${cardMap["visa"]} digits")
        println(cardMap.get("visa"))
        cardMap['age'] = 28
        println(cardMap)
        println("total number of item in the list ${cardMap.size()}") //4
        println(cardMap.containsKey("visa")) //true
    }
}
