import scala.util.control.Breaks._
import scala.collection.mutable.MutableList

object Main {
	def main(args: Array[String]): Unit = {
			var count:Int =11
			var num=11
			var sum = 0
			var flag=1
			while(count > 0)
			{
				if(num.toString.charAt(0)== '1' || num.toString.charAt(num.toString.length-1)=='1') flag=0
				else if(isPrime(num))
				{
					if(check_left(num) && check_right(num))
					{
						println(num)
						sum +=num
						count = count - 1
					}
				}
				println(num)
				num +=2
			}
			println("Sum is "+sum)
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

