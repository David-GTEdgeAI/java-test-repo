package com.example.java8.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.Invocable;
import java.io.FileReader;

// Note: Nashorn was removed in Java 15. This code cannot be directly migrated to Java 17
// as the Nashorn engine is no longer available. A different JavaScript engine like GraalJS
// would need to be used instead.
public class NashornJavaScriptEngine {
    private final ScriptEngine engine;

    public NashornJavaScriptEngine() {
        engine = new ScriptEngineManager().getEngineByName("nashorn");
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