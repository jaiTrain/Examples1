import java.awt.datatransfer.StringSelection
import java.util.*
import kotlin.math.sqrt


/* fun main(args: Array<String>){
     val reader = Scanner (System.`in`)
     print("Enter a number")

     var integer : Int =  reader.nextInt()
     println("You Entered: $integer")


// How to print an integer without scanner
fun main(args: Array<String>){
  print("enter a number")
 val stringInput = readLine()!!
 var integer : Int = stringInput.toInt()
 print("you entered $integer")

}}
// to add integers
fun main (args:Array<String>){
 var num1 = 10
    var num2 = 20
 var add = print(num1 + num2)
} Multiply two floating numbers
fun main(args: Array<String>){
 var num1 = 29
 var num2 = 48
 println(num1*num2)
}


fun main (args : Array<String>){
 val  dividend = 35
 val divisor = 4
 val  quotient = dividend/divisor
 val  remainder = dividend % divisor
 println("quotient = $quotient")
 println("remainder = $remainder")
}

fun main(args: Array<String>){
 var first = 1.20f
    var second = 2.4f
    println("--before Swap--")
    println("First Number = $first")
    println("Second Number = $second")
    val temporary = first
    first = second
    second = temporary

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}


// whether a number is even or odd
fun main (args: Array<String>){
 var num1 = 4
    if (num1 % 2 == 0){
        println("number is even ")
    }
    else{print("number is odd")}
}

// frequency of character in string
fun main(args:Array<String>){
 val string1 = "main"
    val c = string1.count()
    print(c)
}

 fun main (args:Array<String>){
     val ab = 'a'
    var vowelConsonant = if (ab == 'a' || ab == 'e'||ab == 'i'|| ab == 'o'|| ab ==  'u') "vowel" else "Consonant"
        println("$vowelConsonant")
 }

//
fun main(args:Array<String>){
 val a = 20
    val b = 30
    val c = 40
    if (a>b && a>c){
        println("A is greator ")
    }
    else if (a==b || a==c||b==c)
        println("all three numbers are same ")
    else if (b>a && b>c){
        println("B is greator")}
        else {
            println("C i greator")
        }
    }

// to find all the roots of quadratic equation
fun main ( args: Array<String>){
    val a = 18
       val b = 4
       val c = 8
       var root1 : Double = 0.0
       val root2 : Double
       val determinant = b*b- 4.0 * a * c
       // Condition for real and different roots
       if (determinant > 0) {
           root1 = (-b + sqrt(determinant)) / (2 * a)
           root2 = (+b + sqrt(determinant)) / (2 * a)
           var output = print("root1 = $root1 and root 2  = $root2")
       }
       else if (determinant == 0.0) {
           root2 = -b / (2 * a).toDouble()
           root1 = root2

           var output = print(" root 1 = $root1 and root 2 = $root2")

       }
    else{
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-determinant) / (2 * a)

        var output = print(" root 1 = $realPart and root 2 = $imaginaryPart")
       }
       }

// check leap year

fun main(Args: Array<String>){
    val a : Int = 2024

    if ( a % 4 == 0 ){
        print(" leap year")
    }
    else {
        print("Not leap year")
    }
}
// to check whether number is positive or Negative
fun main(args: Array<String>){
    val a = -45
    if ( a > 0 || a == 0){
        print("positive number")
    }
    else{
        print("Negative number")
    }
}
//to check whether character is an alphabet or not
fun main(args:  Array<String>){
    val alphabet = 'A'
    if (alphabet in 'a'..'Z' || alphabet in 'A'..'Z'){
        println("Character is an alphabet")
    }
    else{
        println(" not an alphabet")
    }
}
fun main(args: Array<String>){
    var sum = 0
    var num = 1
    var n : Int = 0
    while (n < 10){
        sum += num
        num ++
        n ++

    }
    println("sum = $sum")
}*/
fun main (args: Array<String>){
    var num = 5
    var n : Int = 1

    var sum : Long = 1


    while (n <= num){

       sum =  sum * num.toLong()
        n++
    }
    println("sum $sum" )
}