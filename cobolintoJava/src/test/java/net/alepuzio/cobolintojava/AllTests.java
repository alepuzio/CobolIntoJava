package net.alepuzio.cobolintojava;

import net.alepuzio.cobolintojava.bean.TestAttr;
import net.alepuzio.cobolintojava.bean.TestAttributeSet;
import net.alepuzio.cobolintojava.generaFile.input.TestConfigurationTemplateFactoryInputForHost;
import net.alepuzio.cobolintojava.generaFile.output.TestConfigurationTemplateFactoryInputFromHost;
import net.alepuzio.cobolintojava.generaFile.process.TestGenerateBean;
import net.alepuzio.cobolintojava.generaFile.process.TestGenerateXML;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestAttr.class, TestAttributeSet.class,
	TestConfigurationTemplateFactoryInputForHost.class, TestConfigurationTemplateFactoryInputFromHost.class,
	TestGenerateBean.class, TestGenerateXML.class
})
public class AllTests {

}
