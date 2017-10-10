package calculator;

import asg.cliche.Command;

/**
 * Created by JavaCourses on 10.10.2017..
 */
public class Calculator {

        @Command
        public double add(double a, double b){
            return a + b;
        }

        @Command
        public double sub(double a,double b){
            return a - b;
        }

        @Command
        public double div(double a,double b){
        return a/b;
        }

        @Command
        public double mul(double a,double b){
            return a*b;
        }

}


