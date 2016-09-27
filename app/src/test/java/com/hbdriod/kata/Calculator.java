package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {
    public int add(String strNumbers){
        Integer sum;
        if (strNumbers.length()>1){
            StringTokenizer tokens = new StringTokenizer(strNumbers, ",");
            String firstNumber = tokens.nextToken();
            String secondNumber = tokens.nextToken();
            sum = Integer.parseInt(firstNumber.toString()) + Integer.parseInt(secondNumber.toString());
            return sum;
        }
        else if(strNumbers == ""){
            return 0;
        }
        else{
            return Integer.parseInt(strNumbers.toString());
        }
    }
}
