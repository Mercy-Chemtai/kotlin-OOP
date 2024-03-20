//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val subaru = car("subaru" , "legacy", "UAB 133F" ,0)
   val audi = car("audi","A4","KBY 456H", 0)


    println(subaru.make)
    println(audi.registration)
    subaru.start()
    audi.start()
     println(audi.speed)

    audi.accelerate(50)
    println(audi.speed)

    audi.accelerate(30)
    println(audi.speed)

    subaru.decelerate(80)
    println(subaru.speed)
    println(audi.speed)
    audi.decelerate(80)





}
class car (var make : String , var model: String , var registration: String , var speed:Int) {
    fun start() {
        println("vrooooomm")
    }

    fun accelerate(acceleration: Int) {
        speed += acceleration
    }

    fun decelerate(deceleration: Int) {
        speed -= deceleration
    }

    fun hoot(sound: String) {
        println(sound)
    }

    fun stop() {
        decelerate(speed)

    }
}
data class classRep(
    var  lovelace : String,
    var anitab: String,
    var adalabRep:String,

)
fun getLeader():{
    val reps = classRep("Nancy","Nancy","Gloria")
    return reps
}

