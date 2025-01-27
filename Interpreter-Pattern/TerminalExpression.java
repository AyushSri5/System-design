public class TerminalExpression implements AbstractExpression{
    String stringValue;
    TerminalExpression(String stringValue){
        this.stringValue=stringValue;
    }
    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}
