package edu.macalester.cs124.grammar;

/**
 * A substitution that always generates the same string.
 */
public class Literal implements Substitution {
    
	private String value;
	
    /**
     * @param value The output of this generator.
     * @return 
     */
    public Literal(String value) {
        value = this.value;
    }
    
    /**
     * Appends this literal's value to the context's result.
     */
    @Override
    public void generate(GeneratorContext context) {
        context.getResult().append(value);
    }
}



//      Substitution pope = new Literal("POPE");
//.....
//      pope.generate(context);    // <--- append "POPE" to the context's result
