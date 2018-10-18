def FibPatternMatch(i:Int):Int = {
    i match{
        case 1 => 1
        case 2 => 1
        case _ =>  FibPatternMatch(i-2) +FibPatternMatch(i-1)
    }
}

println(FibPatternMatch(7))