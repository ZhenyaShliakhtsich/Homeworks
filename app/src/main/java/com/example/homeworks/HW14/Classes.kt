package com.example.homeworks.HW14

class Classes {
    open class clas(
        var a: Int,
        var b: Int
    )

    var clas1 = clas(0, 0)
    var clas2 = clas(0, 0)
    var clas3 = clas(0, 0)
    var clas4 = clas(0, 0)
    var clas5 = clas(0, 0)
    var list = ArrayList<clas>()


    fun generation() {
        list.add(clas1)
        list.add(clas2)
        list.add(clas3)
        list.add(clas4)
        list.add(clas5)
        for (x: Int in 0..4) {
            var a: Int
            var b: Int
            a = (0..10).random()
            b = (0..10).random()
            list.get(x).a = a
            list.get(x).b = b
        }

    }
    open class heir (a:Int,b:Int) : clas(a,b)
    class util(a: Int, b:Int) : heir(a,b){
        fun sum(a:Int,b: Int) = a + b
    }
    val heir1 = clas1
}