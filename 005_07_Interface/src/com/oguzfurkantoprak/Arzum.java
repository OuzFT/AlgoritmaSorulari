package com.oguzfurkantoprak;

public class Arzum implements ITermometre, INemOlcer, ITarihSaatGoster{

	@Override
	public int sıcakligiOlc() {
		
		return 24;
	}

	@Override
	public double nemOlc() {
		
		return 30.4;
	}

	@Override
	public String tarihGoster() {
		// TODO Auto-generated method stub
		return "17.11.2022";
	}

	@Override
	public String saatGoster() {
		// TODO Auto-generated method stub
		return "08:49";
	}
	
	
	
	

}
