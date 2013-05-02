package edu.macalester.cs124.grammar;

import java.util.List;


/**
 * A substitution rule that performs multiple child substitutions in order.
 */
public class Sequence implements Substitution {
	
	private List<Substitution> lSubs = new ArrayList<String>;
    
    /**
     * Adds a new child substitution to the end of this sequence.
     */
    public void add(Substitution sub) {
        lSubs.add(sub);
    }
    
    /**
     * Calls generate() on each children substitution in turn.
     */
    @Override
    public void generate(GeneratorContext context) {
        for (Substitution sub: lSubs){
        	sub.generate(context);
        }
    }
}
