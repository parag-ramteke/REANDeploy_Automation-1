package com.opex.test.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSELBPageObject {
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS Elastic Load Balancer']")
	public static WebElement resource_elb;
		
	@FindBy(how=How.XPATH, xpath="//*[text()='listener']/following::*[text()='Set Json'][1]")
	public static WebElement click_listener_set_json;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='access_logs']/following::*[text()='Set Json'][1]")
	public static WebElement click_accessLog_set_json;
	
	@FindBy(how=How.XPATH, xpath="//*[text()[contains(.,'cross_zone_load_balancing')]]//following::*[@type='search'][1]")
	public static WebElement enter_crossZoneLoadBalancing;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='health_check']/following::*[text()='Set Json'][1]")
	public static WebElement click_healthCheck_set_json;
	@FindBy(how=How.XPATH, xpath="//*[contains(.,'idle_timeout')]/following::*[@ng-if='!floatingLabel']")
	public static WebElement enter_idleTimeout;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='instances']/following::*[text()='Set Array'][1]")
	public static WebElement click_instances_setArray;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(.,'internal')]/following::*[@ng-if='!floatingLabel']")
	public static WebElement enter_internal;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='security_groups']/following::*[text()='Set Array'][1]")
	public static WebElement click_subnetgroups_setArray;
		
	@FindBy(how=How.XPATH, xpath="//*[text()='tags']/following::*[text()='Set Json'][1]")
	public static WebElement click_tags_set_json;
		
	@FindBy(how=How.XPATH, xpath="//*[text()='subnets']/following::*[text()='Set Array'][1]")
	public static WebElement click_subnets_setArray;
	
	
	
}