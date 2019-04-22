package com.bloodbank.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbank.exceptions.BloodException;
import com.bloodbank.model.AcceptEvent;
import com.bloodbank.model.AcceptReview;
import com.bloodbank.model.Admin;
import com.bloodbank.model.AdminList;
import com.bloodbank.model.BloodBank;
import com.bloodbank.model.BloodType;
import com.bloodbank.model.CountList;
import com.bloodbank.model.Donor;
import com.bloodbank.model.DonorList;
import com.bloodbank.model.Event;
import com.bloodbank.model.EventList;
import com.bloodbank.model.Reciver;
import com.bloodbank.model.RevList;
import com.bloodbank.model.Review;
import com.bloodbank.model.ReviewList;
import com.bloodbank.repo.AcceptEventRespository;
import com.bloodbank.repo.AcceptReviewRespository;
import com.bloodbank.repo.AddressRespository;
import com.bloodbank.repo.AdminRespository;
import com.bloodbank.repo.BloodBankRespository;
import com.bloodbank.repo.BloodTypeRespository;
import com.bloodbank.repo.CityRespository;
import com.bloodbank.repo.DonationRespository;
import com.bloodbank.repo.DonorConditionRespository;
import com.bloodbank.repo.DonorRespository;
import com.bloodbank.repo.EventRespository;
import com.bloodbank.repo.GenderRespository;
import com.bloodbank.repo.MedicalConditionRespository;
import com.bloodbank.repo.ReciverRespository;
import com.bloodbank.repo.ReviewRespository;
import com.bloodbank.repo.StateRespository;

@CrossOrigin
@RestController
public class RepoController {

	public RepoController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired(required=true)
	BloodTypeRespository bloodTypeRespository;
	
	@Autowired(required=true)
	BloodBankRespository bloodBankRespository;
	
	@Autowired(required=true)
	AcceptEventRespository acceptEventRespository;
	
	@Autowired(required=true)
	EventRespository eventRespository;
	
	@Autowired(required=true)
	AcceptReviewRespository acceptReviewRespository;
	
	@Autowired(required=true)
	ReviewRespository reviewRespository;
	
	@Autowired(required=true)
	AddressRespository addressRespository;
	
	@Autowired(required=true)
	AdminRespository adminRespository;
	
	@Autowired(required=true)
	CityRespository cityRespository;
	
	@Autowired(required=true)
	DonationRespository donationRespository;
	
	@Autowired(required=true)
	DonorRespository donorRespository;
	
	@Autowired(required=true)
	DonorConditionRespository donorConditionRespository;
	
	@Autowired(required=true)
	GenderRespository genderRespository;
	
	@Autowired(required=true)
	MedicalConditionRespository medicalConditionRespository;
	
	@Autowired(required=true)
	ReciverRespository reciverRespository;
	
	@Autowired(required=true)
	StateRespository stateRespository;
	
	
	@GetMapping("/allbloodbank")
	public List<BloodType> getAllType(){
		return bloodTypeRespository.findAll();
	}
	
	@GetMapping("/home")
	public ModelAndView home(){
		ModelAndView mav=new ModelAndView("Home");
		return mav;
	}
	
	@GetMapping("/admin")
	public ModelAndView admin(){
		ModelAndView mav=new ModelAndView("AdminLogin");
		return mav;
	}
	
	@GetMapping("/banks")
	public List<BloodBank> getBloodBank(){
		List<BloodBank> list=new ArrayList<BloodBank>();
		list=bloodBankRespository.findAll();
		System.out.println(list);
		return list;
		
	}
	
	@GetMapping("/onload")
   	public List<Review> registration(){
   		List<Review> list=new ArrayList<Review>();
   		list = reviewRespository.findAll();
   		return list;
   	}
	
   @GetMapping("/adminlogout")
   	public ModelAndView logout()
   	{
	   String view="AdminLogin";
	   ModelAndView mav=new ModelAndView(view);
   		return mav;
   	}
   
   @GetMapping("/adminblooddata")
  	public CountList blood()
  	{
	   CountList l= new CountList();
	   List<Integer> in=new ArrayList<Integer>();
	   l.setBlood(bloodTypeRespository.findAll());
	   l.setCount(donorRespository.fetchcount());
	   System.out.println(l);
  		return l;
  	}
   
   @PostMapping("/admindonordata")
 	public DonorList don(@RequestBody String ac)
 	{
	   String blo="False";
	   List<Donor> don=donorRespository.fetchactivedonor(ac,blo);
	   List<Donor> ina=donorRespository.fetchinactivedonor(blo);
	   List<Donor> bloc=donorRespository.fetchblockeddonor(ac);
	   DonorList dl=new DonorList(don,ina,bloc);
	   System.out.println(dl);
 		return dl;
 	}

   @GetMapping("/admineventdata")
	public EventList eve()
	{
	   List<Event> don=eventRespository.findAll();
	   List<AcceptEvent> ina=acceptEventRespository.findAll();
	   EventList el=new EventList(don,ina);
	   System.out.println(el);
		return el;
	}
   
   @GetMapping("/adminreviewdata")
	public ReviewList rev()
	{
	   List<Review> don=reviewRespository.findAll();
	   List<AcceptReview> ina=acceptReviewRespository.findAll();
	   ReviewList el=new ReviewList(don,ina);
	   System.out.println(el);
		return el;
	}
   
   @GetMapping("/adminbloodbankdata")
	public List<BloodBank> bloodbank()
	{
	   List<BloodBank> don=bloodBankRespository.findAll();
	   System.out.println(don);
		return don;
	}
   
   @GetMapping("/adminlistdata")
	public List<Admin> adminlist()
	{
	   List<Admin> don=adminRespository.findAll();
	   System.out.println(don);
		return don;
	}
   
   
   @PostMapping("/admindata")
   public AdminList getdata(@RequestBody String admin)
		{
		System.out.println(admin);
		AdminList al=new AdminList();
		Admin ad=adminRespository.adminsearch(admin);
		System.out.println(ad);
		al.setCurradmin(ad);
		al.setAdmin(adminRespository.findAll());
		al.setBloodBank(bloodBankRespository.findAll());
		al.setBloodtypeCount(bloodTypeRespository.count());
		al.setDonorCount(donorRespository.count());
		al.setEventCount(eventRespository.count());
		al.setReviewCount(reviewRespository.count());
		
		return al;
	}
   
   
   
   

   @PostMapping("/adminController")
   public Admin Login(@RequestBody Admin admin)
		{
		System.out.println(admin);
		
		String uname=admin.getAdminUsername();
		String upass=admin.getAdminPassword();
		System.out.println(uname);
		Admin ad=adminRespository.adminLogin(uname,upass);
		System.out.println(ad);
		
		if(ad != null){
			System.out.println("success");
			return ad;
		}
		else{
			
			System.out.println("error");
			return ad;
		}
	
	}
   
   @PostMapping("/curradmindata")
   public Admin getcurrdata(@RequestBody String admin)
		{
		System.out.println(admin);
		Admin ad=adminRespository.adminsearch(admin);
		System.out.println(ad);
		
		return ad;
	}
   
   
   @PostMapping("/addbloodbank")
   public BloodBank addblood(@RequestBody BloodBank bt)
		{
		System.out.println(bt);
		BloodBank ad=bloodBankRespository.save(bt);
		System.out.println(ad);
		
		return ad;
	}
   
   @PostMapping("/addAdmin")
   public Admin addAdmin(@RequestBody Admin admin)
		{
	   
		System.out.println(admin);
		Admin ad=adminRespository.save(admin);
		System.out.println(ad);
		
		
		return ad;
	}
   
   @PostMapping("/userdata")
   public Donor getuserdata(@RequestBody String user)
		{
	   int id =Integer.parseInt(user);
		System.out.println(user);
		Donor ad=donorRespository.usersearch(id);
		System.out.println(ad);
		
		
		return ad;
	}
   
   @GetMapping("/userevent")
   public List<Event> getuserdata()
		{
	   
		
		List<Event> ad=eventRespository.findAll();
		System.out.println(ad);
		
		
		return ad;
	}
   
   
   @PostMapping("/userController")
   public Donor UserLogin(@RequestBody Donor don)
		{
		System.out.println(don);
		
		String uname=don.getDonorName();
		String upass=don.getDonorPassword();
		System.out.println(uname);
		Donor ad=donorRespository.userLogin(uname,upass);
		System.out.println(ad);
		
		if(ad != null){
			System.out.println("success");
			return ad;
		}
		else{
			
			System.out.println("error");
			return ad;
		}
	
	}
   
   
   
   @PostMapping("/search")
   public ModelAndView search(Reciver rev)
		{
		
		String view="Reciver";
		ModelAndView mav=null;
		Connection connobj=null;
		List<Donor> list=new ArrayList<Donor>();
		List<BloodBank> list1=new ArrayList<BloodBank>();
		
		Reciver revlist=reciverRespository.save(rev);
		int bloodty=rev.getBloodType().getBloodId();
		String addcity=rev.getAddress().getAddressCity();
		list=donorRespository.fetchGroupData(bloodty,addcity);
		//list1=bloodBankService.fetchAllData(rev);
		System.out.println(list);
		if(revlist != null){
			mav=new ModelAndView(view);
			mav.addObject("data",list);
			mav.addObject("data1",list1);
		}
		else{
			view="Home";
			mav=new ModelAndView(view);
			mav.addObject("error","username password is wrong");
			
		}
		return mav;
	}
	
   
   
   @PostMapping("/RegistrationController2")
  	public int registration2(@RequestBody Donor donor){
  		System.out.println(donor);
  		int dId=1;
  		    donor.setDonorActive("false");
  		    donor.setDonorBlocked("false");
  			donorRespository.save(donor);
  			
  			System.out.println(donorRespository.findAll());
  		
  		return dId;
  	}
   
   
   @PostMapping("/saverev")
 	public Reciver registration2(@RequestBody Reciver rev){
 		System.out.println(rev);
 		int dId=1;
 			Reciver r=reciverRespository.save(rev);
 			
 			System.out.println(r);
 		
 		return r;
 	}
   
   @PostMapping("/Search")
	public RevList search(@RequestBody String rev){
		System.out.println(rev);
		int r=Integer.parseInt(rev);
		Optional<Reciver> revc= reciverRespository.findById(r);
		Reciver re=revc.get();
		int bt=re.getBloodType().getBloodId();
		String cit=re.getAddress().getAddressCity();
		RevList rr=new RevList();
		List<Donor> d=donorRespository.fetchGroupData(bt, cit);
		List<BloodBank> b=bloodBankRespository.fetchdata(cit);
		rr.setDon(d);
		rr.setBb(b);
			System.out.println(rr);
		
		return rr;
	}
	

}
