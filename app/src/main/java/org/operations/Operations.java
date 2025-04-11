package org.operations;

import org.exceptions.EvaluationException;

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
        ExtendedDoubleEvaluator evaluator = new ExtendedDoubleEvaluator();
    
        return doIt(evaluator, expression);
    }

    private static String doIt(ExtendedDoubleEvaluator evaluator, String expression) throws EvaluationException 
    {
        return evaluator.evaluate(expression).toString();
    }
}
