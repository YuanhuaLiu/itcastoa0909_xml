package cn.itcast.oa0909.test;

import org.junit.Test;

import cn.itcast.oa0909.domain.Person;
import cn.itcast.oa0909.service.PersonService;

public class PersonTest extends BaseSpring{
	@Test
	public void testSavePerson(){
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setPname("踏实哥");
		personService.savePerson(person);
	}
}
