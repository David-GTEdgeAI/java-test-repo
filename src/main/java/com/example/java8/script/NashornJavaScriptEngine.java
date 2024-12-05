package com.example.java8.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.Invocable;
import java.io.FileReader;

public class NashornJavaScriptEngine {
    // Java 17's Nashorn JavaScript engine (removed in Java 18)
    private final ScriptEngine engine;

    public NashornJavaScriptEngine() {
        engine = new ScriptEngineManager().getEngineByName("nashorn");
    }

    public Object evaluateJavaScript(String script) throws Exception {
        return engine.eval(script);
    }

    public void demonstrateJavaScriptInterop() throws Exception {
        // Java 17 specific JavaScript integration
        engine.eval("var greeting = function(name) { return 'Hello, ' + name; }");

        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("greeting", "Java 17");

        // Java 17 specific JavaScript-Java bridging
        engine.eval("var ArrayList = Java.type('java.util.ArrayList')");
        engine.eval("var list = new ArrayList()");
        engine.eval("list.add('Nashorn in Java 17')");
    }
}