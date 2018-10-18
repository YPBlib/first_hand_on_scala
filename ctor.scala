class Linux(bi:Int) {
    println("new Linux!")
    def bit():Int={
        bi match{
            case 32 => 32
            case 64 => 64
            case _ => 0
        }
    }
}
class CentOS{
    println("new CentOS!")
}

var os = new Linux(64)

var node1=new CentOS
println(os)
println(node1)

class Say(words:String*){
    for(s <- words){
        println(s)
    }
}

val s = new Say("abc","123","ABC")
