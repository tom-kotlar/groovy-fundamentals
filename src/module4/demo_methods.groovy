package module4

class demo_methods {
    static void main(String[] args) {
        String[] cards = ["visa", "master", "amex", "maestro", "monzo"]

//        cards.each { println("each card $it") } //each card
//        cards.size().times {{
//            if(it == 0) println("First card in the array: ${cards[it]}") //visa
//        }}
        
        cards.eachWithIndex{ String entry, int i ->  println("$entry elemanet at index $i")}
    }
}