package interpreter_assignment_103;
import java.util.*;

class If2 extends Cond
{
	// Expr expr; inherited from Cond
	// Statement statement1; inherited from Cond

	Statement statement2;

	If2(Expr e, Statement s1, Statement s2)
	{
		expr = e;
		statement1 = s1;
		statement2 = s2;
	}

	void printParseTree(String indent)
	{
		String indent2 = indent+"  ";

		super.printParseTree(indent);
		IO.displayln(indent2 + indent2.length() + " if");
		expr.printParseTree(indent2);
		statement1.printParseTree(indent2);
		IO.displayln(indent2 + indent2.length() + " else");
		statement2.printParseTree(indent2);
	}

	@Override
	void M(Hashtable<String, Val> state) {
		Val exprVal = expr.Eval(state);
		if (exprVal instanceof BoolVal)
			if (((BoolVal)exprVal).val) {
				statement1.M(state);
			}
			else {
				statement2.M(state);
			}
		else {
			//TODO: error message
			return;
		}
	}	
}
