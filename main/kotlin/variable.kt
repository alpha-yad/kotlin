/*variable are of two type var(Mutable) and val(Immutable)*/
fun main(){
    var name:String="ashish"
    val  lastname="yadav"
    println("the type of name is specified explicitly(by the programmer) and lastname is specified by implicitly by the jvm  ${name+lastname}")
    /*lastname="kumar"*///error as val is immutable
    name="kishor"
    println(name)
    println(lastname)
    val car = mutableListOf<String>()
    val indiancar =mutableListOf("mahindra","tata")
    val electric=mutableListOf("tesla","volvo","mahindra")
    car.add("skoda")
    car.add("kia")
    car.add(0,"volkswagen")/*list is immutable in nature*/
    car.removeAt(0)
    car.addAll(indiancar)
    car.remove("tata")
    car.set(0,"suzuki")
    for(elements in car){
        println(elements)
    }
    car.retainAll(electric)/*only matching set of collection is accepted*/
    println()
    for(elements in car){
        println(elements)
    }

}
