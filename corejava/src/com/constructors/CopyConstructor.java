package com.constructors;

public class CopyConstructor {
	String director;
	String producer;
	String hero;
	String heroin;
	double budget;
	double collection;
	float rating;
	
	
	public CopyConstructor(String   director) {
		this.director=director;
//		this(director);
		System.out.println("1 arg constructor");

	
	}

	
	public CopyConstructor(CopyConstructor c, String producer) {

		this.director=c.director;
		this.producer=producer;
	}


	public CopyConstructor(CopyConstructor c, String hero, String heroin) {
		
		this.director=c.director;
		this.producer=c.producer;
		this.hero=hero;
		this.heroin=heroin;
	}


	public CopyConstructor(CopyConstructor c, int budget, double collection) {
		this.director=c.director;
		this.producer=c.producer;
		this.hero=c.hero;
		this.heroin=c.heroin;
		this.budget=budget;
		this.collection=collection;
	}
	public CopyConstructor(CopyConstructor c ,float rating) {
		this.director=c.director;
		this.producer=c.producer;
		this.hero=c.hero;
		this.heroin=c.heroin;
		this.budget=c.budget;
		this.collection=c.collection;
		this.rating=rating;
	}


	public static void main(String[] args) {
		System.out.println("Main method started");
		CopyConstructor c = new CopyConstructor("Buchi babu");
		c.movieInfo();
		CopyConstructor c1 = new CopyConstructor(c,"Mytri");
		c1.movieInfo();
		CopyConstructor c2 = new CopyConstructor(c1,"Raj Kumar","Rani");
		c2.movieInfo();
		CopyConstructor c3 = new CopyConstructor(c2,1200000,2999999.00);
		c3.movieInfo();
		CopyConstructor c4 = new CopyConstructor(c3,3.3f);
		c4.movieInfo();
		



		
		

		
	}
	void movieInfo() {
		System.out.println("Movie Director:" +director);
		System.out.println("Movie Producer:" +producer);
		System.out.println("Hero Name:" +hero);
		System.out.println("Heroin Name:" +heroin);
		System.out.println("Movie Budget:" +budget);
		System.out.println("Movie all time collection:" +collection);
		System.out.println("Movie IMDB rating:" +rating);
		System.out.println("---------------------------------->");
	}

}
