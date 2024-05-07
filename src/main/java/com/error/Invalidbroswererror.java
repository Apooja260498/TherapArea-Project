package com.error;

public class Invalidbroswererror extends Error{
		String Browsername;
		
		public Invalidbroswererror(String browsername2) {
			this.Browsername=Browsername;
		}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invlid broswername: "+Browsername;
		
	}

}
