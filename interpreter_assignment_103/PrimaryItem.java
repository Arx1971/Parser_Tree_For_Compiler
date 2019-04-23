package interpreter_assignment_103;
import java.util.*;

abstract class PrimaryItem
{
	Primary primary;

	abstract void printParseTree(String indent);

	abstract Val Eval(Hashtable<String, Val> state);
	
	abstract boolean isMul();
	
	abstract boolean isDiv();
}