
package parser

object Main 
{
	def main(args: Array[String]) =
	{
		var line : String = "";
		println("Input:");
		line = Console.readLine();
		while (line != "quit" && line != "exit") 
		{
			var tape : Tape = new Tape(Lexer.tokenize(line));
			println((new Expression(tape).calculate()));
			println("Input:");
			line = Console.readLine();
		}
	}
}
