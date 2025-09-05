package module4

class demo_continue_break {
    static void main(String[] args) {
        String[] cards = ["visa", "master", "amex", "maestro", "monzo"]

        for (card in cards) {
            if (card == 'amex') {
//                break  //visa, master
                continue // all except amex
            }
            println("card found  $card")
        }
    }
}
/*
break
the for loop runs thill
the condition is met and the loop breaks
*/

/*
continue
the for loop runs
and skip the value when the condition is met
*/