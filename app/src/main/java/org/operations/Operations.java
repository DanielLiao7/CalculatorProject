package org.operations;

import org.exceptions.EvaluationException;

import com.fathzer.soft.javaluator.BracketPair;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Parameters;

public class Operations {

    public String expression = "";

    public Operations() {
    }

    public Operations(String newExpression) {
        expression = newExpression;
    }

    public String add() {

        return expression + "+";
    }

    public String minus() {

        return expression + "-";
    }

    public String multiply() {

        return expression + "*";
    }

    public String divide() {

        return expression + "/";
    }

    /** 
     * @param String power the exponent operator value
     */
    public String exponent(String power) {

        return expression + "^" + power;
    }

    /** 
     * @param String base the exponent operator value
     */
    public void log(String base) {

        expression = "log_base(" + expression + "," + base + ")";
    }

    public String evaluate() {
        Parameters params = new Parameters();

        // Add the supported operators to these parameters
        params.add(DoubleEvaluator.PLUS);
        params.add(DoubleEvaluator.MINUS);
        params.add(DoubleEvaluator.MULTIPLY);
        params.add(DoubleEvaluator.DIVIDE);
        params.add(DoubleEvaluator.NEGATE);
        params.add(DoubleEvaluator.LOG);
        params.add(DoubleEvaluator.EXPONENT);
        params.add(ExtendedDoubleEvaluator.LOG_BASE);

        // Add the default expression brackets
        params.addExpressionBracket(BracketPair.PARENTHESES);

        ExtendedDoubleEvaluator evaluator = new ExtendedDoubleEvaluator();
    
        return doIt(evaluator, expression);
    }

    private static String doIt(ExtendedDoubleEvaluator evaluator, String expression) throws EvaluationException 
    {
        System.out.println (expression+" = "+new ExtendedDoubleEvaluator().evaluate(expression));
        return new ExtendedDoubleEvaluator().evaluate(expression).toString();
    }
}
