package interpeter_final;

abstract class Header {
    FunName funName;

    void printParseTree(String indent) {
        IO.displayln(indent + indent.length() + " <header>");
        funName.printParseTree(indent + " ");
    }
}