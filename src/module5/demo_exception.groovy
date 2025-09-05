package module5

class demo_exception {
    static void main(String[] args ) {
        try {
//            RandomAccessFile file = new RandomAccessFile("unknown.txt")
            List<String> cards = ["visa", "master", "maestro", "monzo"]
            println(cards[0].size()) //cards[4].size()
            int i = 1/1
            def cardLength = [15, 14, 16, 13]
            checkCardLength(cardLength)
        }
        catch (InvalidCardException e) {
        println "❌ Custom card error: ${e.message}"

        }
        catch (Exception e) {
            println(e.getMessage())
            e.printStackTrace()
        }
        catch (NullPointerException e) {
            println("Null Pointer Exception ${e}")
            println(e.getMessage())
            e.printStackTrace()
        }
        catch (ArithmeticException e ) {
            println(e.getCause())
            println(e.getMessage())
        }
        finally {
            println("Finally block") //We can run this block after try to clean resources
        }

        println("After try/catch")

    }

    static checkCardLength(List list) {
        for (card in list) {
            if (card < 14) {
                throw  new InvalidCardException("Card Contains less then 14 digits")
            }
            println("${card} has 14 and more digits")

        }
    }
}

