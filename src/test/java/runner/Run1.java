// BDD 02/03/11/2021
//API testing-03/11/2021

// Im features file for tags Given, When and Then we can use more AND and But(for negative tc)
package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue="StepDefn", strict=true, dryRun=true, monochrome=true)//we can add in this bracket after glue as ,
//tags="@Sc1" or tags="@Sc2" for corresponding scenario

/*features value in double quote is address of features file as value to feature file as 
 * there is single file so given single file name
 * 
 * glue value is package name of script even more classes then also single package name 
 * */

public class Run1 {

}


/*
Concepts in BDD
dryrun-> Used for compilation of the Step Defination and features files
 and to verify the compilation errors if its value set to true cucumber 
 will verify individual steps in the feature file and the implementation 
 code of steps in feature file within the Step Definition file

features
glue
strict
monochrome-> By default its false, if set to true console output for the 
cucumber test are much more redable
plugin- html,json,xml

*/