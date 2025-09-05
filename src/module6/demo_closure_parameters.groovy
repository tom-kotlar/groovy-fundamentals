package module6

class demo_closure_parameters {
    static void main(String[] args) {
        Closure cardDetails = {firstName, lastName ->
            println("This card is owned by $firstName $lastName")
        }

        cardDetails("T", "K")

        Closure cardDetailsWithArgs = {String... arg ->
            println("Multiple args ${arg.join(' ')}")
        }

        cardDetailsWithArgs("T", "K", "SE")

        def cardLength = [12, 13, 15, 16]
        cardLength.forEach {
            if (it % 2 == 0) {
                println("Even Numbers $it")
                return
            }
            else {
                println("Odd Numbers $it")
                return

            }

        }
    }
}
