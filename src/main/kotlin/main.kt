import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите число лайков: ")
    var likes = sc.nextInt()
    val people: String = if (likes%10==1&&likes%100!=11) {
        "человеку"
    } else{
        "людям"
    }
    println("Понравилось $likes $people")
}