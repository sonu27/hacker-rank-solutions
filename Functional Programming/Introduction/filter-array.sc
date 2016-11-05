def f(delim:Int,arr:List[Int]):List[Int] = for (num <- arr if num < delim) yield num

