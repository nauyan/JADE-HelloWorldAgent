package pkg; 


import jade.core.Agent;

public class HelloWorldAgent extends Agent {

  protected void setup() {
  	System.out.println("Hello World! My name is "+getLocalName());
  	

  	doDelete();
  } 
}

