//package com.tokyo.game.tokyo_game.security.expression;
//
//import com.tokyo.game.tokyo_game.resource.SharedResource;
//import de.congrace.exp4j.Calculable;
//import de.congrace.exp4j.ExpressionBuilder;
//import de.congrace.exp4j.UnknownFunctionException;
//import de.congrace.exp4j.UnparsableExpressionException;
//
//public class EvaluteMathExpression {
//
//    private static int Operator_Size = 2;
//    private int answer;
//    private String pattern;
//
//
//    public EvaluteMathExpression() throws UnparsableExpressionException, UnknownFunctionException {
//        setPattern();
//        setAnswer();
//    }
//
//
//
//    private void setPattern(){
//        StringBuilder result = new StringBuilder();
//        char[] operator = {'+', '-', '*', '/'};
//        result.append(SharedResource.getInstance().randomPositiveInt(9)+1).append(" ");
//        for ( int i = 0 ; i < Operator_Size ; i++){
//            result.append(operator[SharedResource.getInstance().randomPositiveInt(2)+2*i]).append(" ");
//            result.append(SharedResource.getInstance().randomPositiveInt(9)+1).append(" ");
//        }
//        this.pattern = result.toString();
//    }
//
//    private void setAnswer() throws UnparsableExpressionException, UnknownFunctionException {
//        Calculable cal = new ExpressionBuilder(this.pattern)
//                .withVariable("pi", Math.PI)
//                .withVariable("e", Math.E)
//                .build();
//        this.answer =  (int)cal.calculate();
//    }
//
//
//    public String getPattern(){return this.pattern;}
//    public boolean checkAnswer(int input){ return this.answer == input;}
//
//}
//
//
//
