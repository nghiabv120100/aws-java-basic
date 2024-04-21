package integration.ninjas;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerString implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Input TYPE: " + s.getClass().toString());
        logger.log("Input value: " + s);
        return new StringBuilder(s).reverse().toString();
    }
}
