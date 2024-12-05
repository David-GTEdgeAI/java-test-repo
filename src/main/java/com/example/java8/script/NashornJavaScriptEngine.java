package com.example.java8.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.Invocable;
import java.io.FileReader;

// Note: Nashorn was removed in Java 15, this code needs to be replaced with a different JavaScript engine
// like GraalJS. Cannot provide direct conversion as Nashorn functionality was removed.
public class NashornJavaScriptEngine {
    private final ScriptEngine engine;

    public NashornJavaScriptEngine() {
        engine = new ScriptEngineManager().getEngineByName("nashorn");
    }

    public Object evaluateJavaScript(String script) throws Exception {
        return engine.eval(script);
    }

    public void demonstrateJavaScriptInterop() throws Exception {
        engine.eval("var greeting = function(name) { return 'Hello, ' + name; }");

        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("greeting", "Java 8");

        engine.eval("var ArrayList = Java.type('java.util.ArrayList')");
        engine.eval("var list = new ArrayList()");
        engine.eval("list.add('Nashorn in Java 8')");
    }
}