package module3

class demo_range {
    static void main(String[] args) {
        def range1 = 1..10
        println("Size of range1 is ${range1.size()}") //10

        def range2 = 1..<10
        println("Size of range2 is ${range2.size()}") //9

        def range3 = 'a'..'z'
        println("Size of range3 is ${range3.size()}") //26

        println("Sublist of range3 ${range3.subList(0,3)}") //a..c
        println("Range1 to array ${range1.toArray()}")
        println("5th element from the alphabed based on the index ${range3.get(4)}") //e
    }
}
