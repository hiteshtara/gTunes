i
public class g { public static void main(String[] args) {
ScriptEngine engine =
new ScriptEngineManager().getEngineByName("groovy"); 
try {engine.eval("println 'Hello, Groovy!'"); 
engine.eval(new FileReader("src/hello_groovy.groovy")); 
           } catch (ScriptException e) {
               e.printStackTrace();
} catch (FileNotFoundException e) { } } } 
