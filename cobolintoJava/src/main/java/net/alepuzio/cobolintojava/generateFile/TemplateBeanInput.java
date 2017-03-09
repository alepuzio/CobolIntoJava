package net.alepuzio.cobolintojava.generateFile;

import net.alepuzio.cobolintojava.generateFile.TemplateFactoryBeanInputOuput;
/**
 * This class represents the template of a Input generated class
 * */
public abstract class TemplateBeanInput extends TemplateFactoryBeanInputOuput {

	private  static final String KIND_BEAN = "Input";
	
	/**
	 * Return the suffix of the class
	 * */
	@Override
	public  String getKindBean(){
		return KIND_BEAN;
	}
}
