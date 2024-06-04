package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=true,glue="com.stepdefinition", features="C:\\Users\\Lenovo\\eclipse-workspace\\JavaMaven\\src\\test\\resources\\Features")
public class TestRunnerClass {

	
	
	}
