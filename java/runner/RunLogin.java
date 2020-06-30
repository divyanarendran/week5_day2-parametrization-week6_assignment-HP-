package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features"},glue="steps",monochrome=true,//snippets=SnippetType.CAMELCASE,
                            tags= {"@smoke,@sanity"},//OR,
                           plugin= {"pretty","html:reports"})
public class RunLogin extends AbstractTestNGCucumberTests{

}
