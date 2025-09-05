package module3

class demo_list {
    static void main(String[] args) {
        def intArray = new int[2]
        intArray[0] = 1
        intArray[1] = 2
//        intArray[2] = 3 we cannot update the length of the array in runtime
        println(intArray)

        def list = [10, 20, 30, 40, 50]
        println("The size of the list is  ${list.size()}")
        list.add(60)
        println("The size of the list is  after add ${list.size()}")
        list.remove(0)
        println("The size of the list is  after remove ${list.size()}")
        println("List values ${list}")

        def complexList = [10, 20, 30, 40, 50, "String"]
        println("List values ${complexList.size()}") // each element in current list is treated as object not a primitive type
        def complexList1 = [10, 20, 30, 40, 50, ["Name", "Value"]]
        println("Complex List values size is ${complexList1.size()}")
        println(complexList1[5][0])

    }
}
