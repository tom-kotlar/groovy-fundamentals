package module3

class demo_operators {
    static void main(String[] args) {
        println("Addition ${5+5}")
        println("Multiplication ${5*5}")
        println("Division: ${5/5}")

        println 5 + 5/5 *5 //10
        println 5 + 5/(5 * 5) //10

        boolean var = 1 //true
        boolean var1 = 0 //false

        println(var && var1)
        println(var || var1)
        println(!var1)

        int var2 = 2
        int var3 = 2
        String myName = "Tomas"
        println(var2 == var3)

        println("Some line with double quotes and variable $var")

        println("""Some multiline 
                     with triple 
                     quotes and 
                     variable $var""")
        println("Some line with single quotes and variable expression ${myName.substring(0,2)}")
    }
}
