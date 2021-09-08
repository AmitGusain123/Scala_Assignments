object Operators{

	def arithmeticOperator(a: Int, b: Int):Unit = {
		/*Arithmetic Operator: +, -, *, /, % */
		println("a + b = " + (a + b))
		println("a - b = " + (a - b))
		println("a * b = " + (a * b))
		println("a / b = " + (a / b))
		println("a % b = " + (a % b))
		println()
	}
	
	def relationalOperator(a: Int, b: Int)= {
		/*Relational Operator: ==, !=, >, <, >=, <= */    
		println("Is a == b: " + (a == b))
    	println("Is a != b: " + (a != b))
		println("Is a > b: " + (a > b))
		println("Is a < b: " + (a < b))
 		println("Is a >= b: " + (a >= b))
    	println("Is a <= b: " + (a <= b))
		println()
	}
	
	def logicalOperator(c: Boolean, d: Boolean):Unit = {
		/*Logical Operator: !(), ||, && */
     	println("!(c && d) = " + !(c && d))
		println("c || d = " + (c || d))
		println("c && d = " + (c && d))
		println()
		
	}
	
	def bitwiseOperator(a: Int, b: Int):Unit = {
    	var c:Int = 0
		/*Bit-wise Operator: &, |, ^, ~, <<, >>, >>> */
		c = a & b
		println("a & b = " + c)
    	c = a | b
    	println("a | b = " + c)
		c = a ^ b
		println("a ^ b = " + c)
		c = ~a
		println("~a = " + c)
		c = a << 1
		println("a << 1 = " + c)
		c = a >> 1
		println("a >> 1 = " + c)		
		c = a >>> 1
		println("a >>> 1 = " + c) //Bitwise right shift zero-fill
		
		// The >> operator preserves the sign (sign-extends), while >>> zeroes the leftmost bits (zero-extends)
		println()
	}
	
	def assignmentOperators(a: Int):Unit = {
        var b:Int = 1
		/*Assignment Operators: +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |= */
		b += a
    	println("b += a = " + b)
		b -= a
    	println("b -= a = " + b)
		b *= a
    	println("b *= a = " + b)
		b /= a
    	println("b /= a = " + b)
		b %= a
    	println("b %= a = " + b)
		b <<= 1
    	println("b <<= 1 = " + b)
		b >>= 1
    	println("b >>= 1 = " + b)
    	b &= a
    	println("b &= a = " + b)
     	b ^= a
    	println("b ^= a = " + b)
    	b |= a
    	println("b |= a = " + b)
		println()
	}
	
		
	def main(args: Array[String]): Unit = {
		var a: Int = scala.io.StdIn.readLine("Enter 1st value: ").toInt
        var b: Int = scala.io.StdIn.readLine("Enter 2nd value: ").toInt
        println()
		arithmeticOperator(a,b)
		relationalOperator(a,b)
		logicalOperator(true, false)
		bitwiseOperator(a,b)
		assignmentOperators(a)
	}
}