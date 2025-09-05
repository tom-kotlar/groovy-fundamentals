package module6

class demo_closure_scope {
    static void main(String[] args) {
        def processedCard = "visa"

        def process = { String cardType ->
            println(this)
            println("owner": owner)
            println("delegate": delegate)
            def sub_process = {
                println("$it found")
                println(this)
                println("owner sub": owner)
                println("delegate sub": delegate)
            }
            switch (cardType){
                case ("visa"):
                sub_process('visa')
                break
                case ("monzo"):
                    sub_process('monzo')
                    break
                default:
                    sub_process("Nothing to process")
            }
        }
        process(processedCard)

        def testDelegate = {
            deleteCharAt(10)
        }
        StringBuffer build = new StringBuffer("this is a test String")
        testDelegate.delegate = build

        println testDelegate()
    }
}
/*

| Concept    | Groovy                                                      | JS/TS Equivalent                                                  |
| ---------- | ----------------------------------------------------------- | ----------------------------------------------------------------- |
| `this`     | Class instance (like Java’s `this`)                         | `this` inside a class method or bound function                    |
| `owner`    | Enclosing closure/class that defined this closure           | Lexical parent scope (like arrow functions capturing `this`)      |
| `delegate` | A “proxy” object the closure can act on (can be reassigned) | No direct equivalent; closest is `call/apply/bind` or `with(obj)` |

*/