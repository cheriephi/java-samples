package controller;

public class Controller {
	Presenter presenter;
	Person person;
	
	public Controller() {
		this.presenter = new Presenter();
	}
	
	public void greet() {
		presenter.greet("Hello!");
	}
	public void askName() {
		String name = presenter.askName("What's your name?");
		person = new Person(name);
	}
	public void sendMessage() {
		presenter.sendMessage("Hello " + person.getName());
	}
}
