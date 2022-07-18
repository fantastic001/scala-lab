
package parser; 


class Factor(tape : Tape) 
{
	var is_number : Boolean = false; 
	var number : Int = 0;
	var expression : Expression = null; 
	if (tape.acceptNumber()) 
	{
		is_number = true; 
		number = tape.accepted.toInt;
	}
	else if (tape.accept("(")) 
	{
		expression = new Expression(tape);
		tape.expect(")");
	}
	else 
	{
		tape.error("Factor parsing error");
	}

	def calculate() : Int =
	{
		if (is_number) return number; 
		else 
		{
			return expression.calculate();
		}
	}
}
