package cn.itcast.oa0909.struts2.action;

import cn.itcast.oa0909.domain.Person;
import cn.itcast.oa0909.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{
	private PersonService personService;
	public PersonService getPersonService() {
		return personService;
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public String savePerson(){
		Person person = new Person();
		person.setPname("王二麻子");
		this.personService.savePerson(person);
		return null;
	}
}
