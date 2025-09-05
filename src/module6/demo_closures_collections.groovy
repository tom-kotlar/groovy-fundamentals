package module6

class demo_closures_collections {
    static void main(String[] args) {
        List<String> cards = ["visa", "master", "maestro", "monzo"]
        String date = new Date().format("MM dd")
        mapCards(cards, { println("read card $it at $date") } )

        def findBiggerThan = cards.find {(it.length() > 4)}
        println(findBiggerThan)

        def findAllBiggerThan = cards.findAll {(it.length() > 4)}
        findAllBiggerThan.each { println("find all $it")}

        def cardCollection = [visa:16, master:13, maestro:17, monzo:14]
        cardCollection.collect {
           print it.key.toUpperCase()
            println it.value * 2
        }
        cardCollection.eachWithIndex{Map.Entry<String, Integer> entry, int i ->
            println("$i ${entry.key.toUpperCase()} ${entry.value *2}")
        }
    }

    static def mapCards(List<String> cards, Closure chunk) {
        for (int i = 0; i < cards.size(); i++) {
            chunk(cards[i])
        }
    }
}