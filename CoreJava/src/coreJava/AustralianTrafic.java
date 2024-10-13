package coreJava;

import demoPack.CentralTraffic;

public class AustralianTrafic implements CentralTraffic , ContinentalTraffic {

	public static void main(String[] args) {
		CentralTraffic a = new AustralianTrafic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

		AustralianTrafic at = new AustralianTrafic();
		ContinentalTraffic ct = new AustralianTrafic();
		at.walkonsymbol();
		ct.Trainsymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implemetation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implemetation");
	}

	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainsymbol");
	}

}
