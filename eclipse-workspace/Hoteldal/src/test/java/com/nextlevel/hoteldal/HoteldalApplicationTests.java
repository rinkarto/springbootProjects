package com.nextlevel.hoteldal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nextlevel.hoteldal.entities.Hotel;
import com.nextlevel.hoteldal.repos.HotelRepository;

@SpringBootTest
class HoteldalApplicationTests {


	@Autowired
	private HotelRepository hotelrepository;
	//write our own tests
	@Test
	public void testCreateHotel() {
		
		Hotel hot = new Hotel();
		hot.setName("Samantha");
		hot.setPhone("0211333364");
		hot.setRoom(123);	
		hotelrepository.save(hot);
	}
	
	//find hotel
	@Test
	public void testFindHotelById() {		
		Hotel hot = hotelrepository.findById(1).get();
	
		System.out.println(hot);
	}
	
	//update hotel
	@Test
	public void testUpdateHotelById() {		
		Hotel hot = hotelrepository.findById(2).get();
		hot.setName("Kwasi");
		hot.setPhone("024416277");
		hot.setRoom(988);
		hotelrepository.save(hot);	
	}
	//delete hotel
	@Test
	public void testDeleteHotel() {
		Hotel hot = hotelrepository.findById(4).get();
		hotelrepository.delete(hot);
	}

}
