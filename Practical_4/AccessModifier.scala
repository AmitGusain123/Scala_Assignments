class test{
    var a:Int = 77 //public

    private var a1:Int = 123
    def display1(){
        a1 = 54
        println("Private val from test class: "+a1)
    }

    protected var a2:Int = 123
    def display2(){
        a2 = 34
        println("Protected val from test class: "+a2)
    }
}

class extended extends test{
    /* def display1_1(){
        a1 = 21
        println("Private val from extended class: "+a)
    } */
    def display2_1(){
        a2 = 28
        println("Protected val from extended class: "+a2)
    }
}

object AccessModifiers{
    def add(a: Int, b: Int): Unit = {
        var sum: Int = a+b
        println ("Sum of "+a+" and "+b+" is: "+sum)
        return
    }

    def main(args: Array[String]){
        println("1. Add 2 numbers \n2. See how Access Modifiers function")
        val choice: Int = scala.io.StdIn.readLine("Enter your choice: ").toInt
        if (choice == 1){
            var a: Int = scala.io.StdIn.readLine("Enter 1st value: ").toInt
            var b: Int = scala.io.StdIn.readLine("Enter 2nd value: ").toInt
            /* val a: Int = scala.io.StdIn.readLine("Enter 1st value: ").toInt
            val b: Int = scala.io.StdIn.readLine("Enter 2nd value: ").toInt */
            a = 60
            add(a,b)
        }
        else if (choice == 2){
            var x = new test()
            var y = new extended()
            println("Public val from main method: "+x.a) //works

            //println("Private val from main method: "+x.a1) //doesn't work
            x.display1() //works
            //y.display1_1() //doesn't work

            //println("Protected val from main method: "+x.a2) //doesn't work
            x.display2() //works
            y.display2_1() //works
        }
        else println("Wrong input for choice!")
    }
}