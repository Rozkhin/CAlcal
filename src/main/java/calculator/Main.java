package calculator;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by JavaCourses on 10.10.2017..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("calc","calculator",new Calculator()).commandLoop();


        }
    }

