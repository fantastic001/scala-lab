
package parser

object Main 
{
	def main(args: Array[String]) 
	{
		for (c <- Lexer.tokenize("1+2-(4*5)")) 
		{
			println(c);
		}
	}
}
