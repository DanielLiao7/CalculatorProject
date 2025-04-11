package org.operations;

import java.util.Iterator;
 
import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Function;
import com.fathzer.soft.javaluator.Parameters;
 
/** A subclass of DoubleEvaluator that supports SQRT function.
 */
public class ExtendedDoubleEvaluator extends DoubleEvaluator {
    /** Defines the new function (square root).*/
    public static final Function SQRT = new Function("sqrt", 1);
    public static final Function LOG_BASE = new Function("log_base", 2);
    private static final Parameters PARAMS;
    
    static {
        // Gets the default DoubleEvaluator's parameters
        PARAMS = DoubleEvaluator.getDefaultParameters();
        // add the new sqrt function to these parameters
        PARAMS.add(SQRT);
        PARAMS.add(LOG_BASE);
    }
    
    public ExtendedDoubleEvaluator() {
        super(PARAMS);
    }
    
    public ExtendedDoubleEvaluator(Parameters parameters) {
		super(parameters);
	}

    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }
    
    @Override
    protected Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
        if (function == SQRT) {
            // Implements the new function
            return Math.sqrt(arguments.next());
        } else if (function == LOG_BASE) {
            // Implements the new function
            return customLog(arguments.next(), arguments.next());
        } else {
            // If it's another function, pass it to DoubleEvaluator
            return super.evaluate(function, arguments, evaluationContext);
        }
    }
}