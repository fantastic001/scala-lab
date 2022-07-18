
package parser; 

class Term(tape : Tape) 
{
	var left = new Factor(tape);
	var operator : String = "";
	var right : Term = null;
	if (tape.accept("*") || tape.accept("/")) 
	{
		operator = tape.accepted;
		right = new Term(tape);
	}
	def calculate() : Int =
	{
		if (operator == "") return left.calculate();
		else if (operator == "*") return left.calculate() * right.calculate();
		else return left.calculate() / right.calculate();
	}

}
