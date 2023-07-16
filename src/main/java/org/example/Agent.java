package org.example;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Agent loaded");
        String classNameToTransform = "com/test/HelloWorld";
        String methodNameToIntercept = "test";
        ClassFileTransformer transformer = new ExampleTransformer(classNameToTransform, methodNameToIntercept);
        inst.addTransformer(transformer);
    }
}
