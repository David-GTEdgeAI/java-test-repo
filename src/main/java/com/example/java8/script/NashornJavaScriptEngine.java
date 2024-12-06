package com.example.java8.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.Invocable;
import java.io.FileReader;

public class NashornJavaScriptEngine {
    private final ScriptEngine engine;

    public NashornJavaScriptEngine() {
        var engineManager = new ScriptEngineManager();
        engine = engineManager.getEngineByName("graal.js");
    }

    public Object evaluateJavaScript(String script) throws Exception {
        return engine.eval(script);
    }

    public void demonstrateJavaScriptInterop() throws Exception {
        engine.eval("""
                var greeting = function(name) { 
                    return 'Hello, ' + name; 
                }
                """);

        var invocable = (Invocable) engine;
        var result = invocable.invokeFunction("greeting", "Java 8");

        engine.eval("""
                var ArrayList = Java.type('java.util.ArrayList');
                var list = new ArrayList();
                list.add('Nashorn in Java 8');
                """);
    }
}