package com.javaprogram;

interface CentralTraffic
{
	public void greenGo();
	public void redStop();
	public void FlashYellow();
}

interface ContinentalTraffic {

public void Trainsymbol();
}







public class AustralianTrafic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic c=new AustralianTrafic();
		c.greenGo();
		c.redStop();
		c.FlashYellow();
		
		ContinentalTraffic cb=new AustralianTrafic();
		cb.Trainsymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
	}
		
	

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
		
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println(" train symbol implementation");
	}

}
