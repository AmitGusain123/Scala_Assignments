object DataTypes{  
    def unitFunct(): Unit = {
        println("Inside UnitFunct() function.")
    }

    /* def logException(e: Exception): Nothing = {
        println("Logging Exception: "+e.getMessage)
        throw new Exception("My new exception")
    } */

    def ar(inp: AnyRef) = println(inp) //accepts any type of object (List, MyClass, etc)
    def av(inp: AnyVal) = println(inp) //accepts any type of value (int, float, etc)
    def an(inp: Any) = println(inp) //accepts anything (Superclass of AnyRef and AnyVal)

    /* val nv: String = null
    println(nv.length) */ 	

       val nv: Null = null
    /*println(nv.length) */

    def main(args: Array[String]){
        var b: Byte = 10
        println ("Byte Value: "+b)

        var s: Short = 196
        println ("Short Value: "+s)

        var i: Int = 6996
        println ("Integer Value: "+i)

        var l: Long = 969000
        println ("Long Value: "+l)

        var f: Float = 3
        println ("Floating Point Value: "+f)

        var d: Double = 69.69
        println ("Double Value: "+d)

        var c: Char = 'A'
        println ("Character Value: "+c)

        val str: String = "Amit_Gusain"
        println ("String Value: "+str)

        var bl: Boolean = (1==2)
        println ("Boolean Value: "+bl)

        val u = unitFunct()
        println ("Return Value: "+u)

        ar(nv)

        av(1)
        
        an(1)
        an("One")
        an(nv)
    }
}