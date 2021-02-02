package com.springboot.controller;

import java.sql.Date;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.model.Guest;
import com.springboot.service.GuestService;

@SpringBootApplication
@Controller
public class GuestController {
	@Autowired
	GuestService guestService;
	@RequestMapping("/home")
	public ModelAndView home()
	{
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("home");
		 //mv.addObject("msg", null);
		return mv;
	}
	
	@RequestMapping("/accept")
	public ModelAndView afterAccept()
	{
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("AfterAccept");
		 //mv.addObject("msg", null);
		return mv;
	}
	
	@RequestMapping("/add")
	public  ModelAndView addNewGuest(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("emailid") String emailid, 
			@RequestParam("dateofbirth") Date dateofbirth,@RequestParam("cityname") String cityname,@RequestParam("dateofstarting") Date dateofstarting,@RequestParam("dateofleaving") Date dateofleaving)
	{
		 ModelAndView mv=new ModelAndView();
		 Guest guest=new Guest();
		 guest.setGuestFirstName(firstname);
		 guest.setGuestLastName(lastname);
		 guest.setGuestrEmailId(emailid);
		 guest.setDateOfBirth(dateofbirth);
		 guest.setCityOfGuest(cityname);
		 guest.setStartDate(dateofstarting);
		 guest.setEndDate(dateofleaving);
		 guest=guestService.addNewGuest(guest);
		 
//		 if(temp>0)
//		 {
			// Guest guest1=guestService.getInformationOfGuest(temp);
			 int age=Integer.parseInt(guest.getStartDate().toString().substring(0, 4))-Integer.parseInt(guest.getDateOfBirth().toString().substring(0, 4));
			 long days = ChronoUnit.DAYS.between(guest.getStartDate().toLocalDate(), guest.getEndDate().toLocalDate());
			 long cost=4000*days;
			 mv.addObject("firstname",guest.getGuestFirstName());
			 mv.addObject("lastname",guest.getGuestLastName());
			 mv.addObject("age",age);
			 mv.addObject("cost",cost);
			 mv.addObject("days",days);
			 mv.setViewName("AfterReservation");
		// }
		 
		 return mv;
	}

}
