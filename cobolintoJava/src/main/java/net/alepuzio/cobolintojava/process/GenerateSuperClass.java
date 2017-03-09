package net.alepuzio.cobolintojava.process;

import java.util.Properties;
import java.util.Set;

import net.alepuzio.cobolintojava.bean.Attr;
import net.alepuzio.cobolintojava.bean.SetOfAttributes;

/**
 * Superclass of every class  that generates Java source code. 
 * */
public abstract class GenerateSuperClass {

	private  SetOfAttributes attributesFromFiles = new SetOfAttributes();

	public abstract Properties getProperties() ;

	public SetOfAttributes getAttributes(){
		return this.attributesFromFiles;
	}
	
	public abstract void makesListDividedForInput(Set<Attr> list) ;



}
