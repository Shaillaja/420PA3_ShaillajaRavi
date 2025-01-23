package com.modelClass;
//ex3
public class Calculator {
    double num1,num2,result;
    public double add (double num1, double num2)
    {
        result=num1+num2;
        return result;
    }
    public double sub (double num1, double num2)
    {
        result=num1-num2;
        return result;
    }
    public double mul (double num1, double num2)
    {
        result=num1*num2;
        return result;
    }
    public double div (double num1, double num2)
    {
        if(num2==0)
        {
        throw new ArithmeticException("Division by zero is not allowed");
        }
        result=num1/num2;
        return result;
    }


}
