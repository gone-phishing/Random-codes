import scala.util.control.Breaks._
import scala.collection.mutable.MutableList

object Main {
	def main(args: Array[String]): Unit = {
		var test : Int = readInt
		while(test > 0)
		{
			val a:Int =readInt
			if(!isPrime(a)) println("DEAD")
			else if(a.toString.count(_ == '0') > 0) println("DEAD")
			else
			{
				if(check_left(a) && check_right(a)) println("CENTRAL")
				else if(check_left(a)) println("LEFT")
				else if(check_right(a)) println("RIGHT")
				else println("DEAD")
			}
			test = test - 1
		}
	}
	def check_left(a : Int):Boolean = {
		val str1: String = ""+a
		var ls: MutableList[Int] = MutableList[Int]()
		for(i <- 0 to str1.length - 1) ls += str1.subSequence(i,str1.length).toString.toInt
		for(i <- 0 to ls.length - 1)
		{
			if(!isPrime(ls(i))) return false
		} 
		return true
	}
	def check_right(b : Int):Boolean = {
		var a:Int = b
		while(a>0)
		{
			if(!isPrime(a)) return false
			a = a/10
		}
		return true
	}
	def isPrime(n: Int):Boolean =
	{
		if(n == 1) return false
		else !((2 until n-1) exists (n % _ == 0))
	}
}

