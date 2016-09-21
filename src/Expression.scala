
package parser; 

class Expression(tape : Tape) 
{
	var operators : Array[String] = new Array[String](0);
	var terms : Array[Term] = new Array[Term](0);
	if (tape.accept("+") || tape.accept("-")) 
	{
		operators = operators :+ tape.accepted; 
	}
	else 
	{
		operators = operators :+ "+";
	}
	terms = terms :+ new Term(tape);
	while (tape.accept("+") || tape.accept("-")) 
	{
		operators = operators :+ tape.accepted; 
		terms = terms :+ new Term(tape);
	}

	def calculate() : Int = 
	{
		var res : Int = 0; 
		for (index <- 0 to operators.length - 1)  
		{
			if (operators(index) == "+") 
			{
				res = res + terms(index).calculate();
			}
			else 
			{
				res = res - terms(index).calculate();
			}
		}
		return res;
	}


}
