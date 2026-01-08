package com.kodewala.poly;

class NetBanking {

}

class HDFCNetBanking extends NetBanking {

}

public class Driver {
	public static void main(String[] args) {
		HDFCNetBanking nb0 = new HDFCNetBanking();

		NetBanking nb1 = (NetBanking) new HDFCNetBanking(); // super class can refer child class object
															// up casting happens automatically.
		HDFCNetBanking nb2 = (HDFCNetBanking) new NetBanking(); // down casting. Manual
	}
}
