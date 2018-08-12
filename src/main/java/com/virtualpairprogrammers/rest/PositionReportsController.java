package com.virtualpairprogrammers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpairprogrammers.Data;
import com.virtualpairprogrammers.Position;
import com.virtualpairprogrammers.VehicleNotFoundException;

@RestController
public class PositionReportsController 
{
	@Autowired
	private Data data;
	
	@RequestMapping(method=RequestMethod.GET,value="/vehicles/{vehicleName}")
	public ResponseEntity<Position> getLatestReportForVehicle(@PathVariable String vehicleName)
	{
		
		// this code was created to mimic position tracker failures
		/*try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		
		// here i am trying to create a situation when this method fails 75% times when called
		if(Math.random() < 0.65) {
			throw new RuntimeException("Problem with getting LatestReportForVehicle");
		}*/
		
		
		try 
		{
			Position position = data.getLatestPositionFor(vehicleName);
			return new ResponseEntity<Position>(position, HttpStatus.OK);
		} 
		catch (VehicleNotFoundException e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/vehicles1/{vehicleName}")
	public ResponseEntity<Position> getLatestReportForVehicle1(@PathVariable String vehicleName)
	{
		
		// this code was created to mimic position tracker failures
		/*try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		
		// here i am trying to create a situation when this method fails 75% times when called
		if(Math.random() < 0.65) {
			throw new RuntimeException("Problem with getting LatestReportForVehicle");
		}*/
		
		
		try 
		{
			Position position = data.getLatestPositionFor(vehicleName);
			return new ResponseEntity<Position>(position, HttpStatus.OK);
		} 
		catch (VehicleNotFoundException e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
