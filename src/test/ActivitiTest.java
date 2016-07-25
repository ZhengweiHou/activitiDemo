package test;

import static org.junit.Assert.*;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

public class ActivitiTest {

	@Test
	public void deploymentProcessDefinition() {
		ProcessEngine processEngine = ProcessEngineConfiguration  
				.createProcessEngineConfigurationFromResource(  
						"applicationContext.xml").buildProcessEngine();
		Deployment deployment = processEngine.getRepositoryService().createDeployment()
		.name("hzwtest1")
		.addClasspathResource("bpmn/leaveBill.bpmn")
		.addClasspathResource("bpmn/leaveBill.png")
		.deploy();
		System.out.println(deployment.getId());
		System.out.println(deployment.getName());
	}

}
