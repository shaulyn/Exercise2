import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите число лайков: ")
    var likes = sc.nextInt()
    val people: String = if ((likes%2.0).toInt() ==1||(likes%2.0).toInt()==5) {
        "человеку"
    } else{
        "людям"
    }
    println("Понравилось $likes $people")
}