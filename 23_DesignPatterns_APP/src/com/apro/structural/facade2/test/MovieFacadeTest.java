package com.apro.structural.facade2.test;

import com.apro.structural.facade2.model.MovieFacade;

public class MovieFacadeTest {
	public static void main(String[] args) {
		MovieFacade moiveNight = new MovieFacade();
		
		moiveNight.projectorFunctions();
		moiveNight.soundSystemFunctions();
		moiveNight.dvdPlayerFunctions();
	}
}
