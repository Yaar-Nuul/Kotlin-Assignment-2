//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    nameAndGreeting("Bob")
    modulus(14.5, 4)
add(134,66,72,987)
    interestingFactAboutMe("I am 6'3 and I love playing basketball")

    }
fun nameAndGreeting(name:String){
    var greeting = "Hello $name"
    println(greeting)
}
fun modulus(num1:Double, num2:Int){
var result = num1%num2
    println(result)

    }
fun add(a: Int, b: Int, c:Int, d:Int){
    var sum = a + b + c + d
    println(sum)

}
fun interestingFactAboutMe(interest: String){
    println(interest)
}