package com.litmus7.controllers;

import java.util.List;

import org.hibernate.loader.collection.SubselectOneToManyLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.litmus7.dao.UserDAO;
import com.litmus7.model.User;
import com.litmus7.mongo.repositories.MemberRepository;

@Controller
@RequestMapping("/hello")
public class HomeController{
 
	
	@Autowired
    private MemberRepository repository;
	
   @RequestMapping(method = RequestMethod.GET)
   public ModelAndView printHello(ModelMap model) {
	   System.out.println("Testing");
      model.addAttribute("message", "Hello Spring MVC Framework!");
      
      /*
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      
      UserDAO userDAO = context.getBean(UserDAO.class);
       
      User user = new User();
      //user.setUserId(1);
      user.setName("Nayana"); user.setAge(34);
      user.setEmail("nayana@litmus7.com");
      user.setGender("F");
       
      userDAO.save(user);
       
      System.out.println("Person::"+user);
       
      List<User> list = userDAO.list();
       System.out.println("NUmber of users"+list.size());
      for(User u : list){
          System.out.println("Person List::"+u);
      }
      //close resources
      context.close(); 
      
      */
      
      System.out.println("Testing...................");
      System.out.println("repository ------"+repository);
      List members = repository.findAll();
      
      ModelAndView modelAndView = new ModelAndView("index");

      modelAndView.addObject("members", members );

      return modelAndView;
   }

   
}