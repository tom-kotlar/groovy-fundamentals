package module4

class demo_switch {
    static void main(String[] args) {
        def card =  System.in.newReader().readLine()

        switch (card.trim().toLowerCase()) {
            case ('visa'):
                println("visa card Found")
                break
            case ('master'):
                println("master card Found")
                break
            case ('amex'):
                println("amex card Found")
                break
            case ('maestro'):
                println("maestro card Found")
                break
        }

    }

}
