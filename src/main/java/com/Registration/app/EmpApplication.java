package com.Registration.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.Registration.Rest.EmpResource;

public class EmpApplication extends Application{
	private Set<Object> sigletons = new HashSet<Object>();
	
	public EmpApplication()
	{
		
		singletons.add(new EmpResource());
	}
  @Override
  public Set<Object> getSingletons()
  {
	return singletons;  
  }
}
