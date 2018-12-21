/**
 * 
 */
package com.training.sdet.cucumber.CucumberDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Urvi
 *
 */

@CucumberOptions(features = "Features/ddtLoginInvalid.feature")

public class TestRunner extends AbstractTestNGCucumberTests{

}
