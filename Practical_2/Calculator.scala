object Calculator{
    def add(a: Int, b: Int): Unit ={
        var sum: Int = a+b
        println(" Sum of "+a+" and "+b+" = "+sum)
        return
    }
    def sub(a: Int, b: Int): Unit ={
        var dif: Int = a-b
        println("Difference between "+a+" and "+b+" = "+dif)
        return
    }
    def mul(a: Int, b: Int): Unit ={
        var prod: Int = a*b
        println("Product of "+a+" and "+b+" = "+prod)
        return
    }
    def div(a: Int, b: Int): Unit ={
        var quo: Int = a/b
        var rem: Int = a%b
        println("When "+a+" is divided by "+b+" quotient = "+quo+" and remainder = "+rem)
        return
        
    }
    def main(args: Array[String]){
        println("1. Addition \t\t 2. Subtraction \n3. Multiplication \t 4. Division")
        val choice: Int = scala.io.StdIn.readLine("Enter your choice: ").toInt
        var a: Int = scala.io.StdIn.readLine("Enter 1st value: ").toInt
        var b: Int = scala.io.StdIn.readLine("Enter 2nd value: ").toInt
        if (choice==1)
            add(a,b)
        else if (choice==2)
            sub(a,b)
        else if (choice==3)
            mul(a,b)
        else if (choice==4)
            div(a,b)
        else println("Wrong input for choice!")
    }
}