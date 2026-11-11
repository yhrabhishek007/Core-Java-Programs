package com.multithreading;

//To work with multiple threads we should create each class for each thread and override run method

class AudioThread extends Thread {

	@Override
	public void run() {
		System.out.println("Audio Thread Started");

		for (int i = 0; i < 20; i++) {
			System.out.println("Audio :" + i);
		}
		System.out.println("Audio Thread ended");

	}

}

class VideoThread extends Thread {

	@Override
	public void run() {
		System.out.println("Video Thread Started");

		for (int i = 0; i < 20; i++) {
			System.out.println("Video :" + i);
		}
		System.out.println("Video Thread ended");

	}

}

class TimerThread extends Thread {

	@Override
	public void run() {
		System.out.println("Timer Thread Started");

		for (int i = 0; i < 20; i++) {
			System.out.println("Timer :" + i);
		}
		System.out.println("Timer Thread ended");

	}
}

public class TestThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		AudioThread at = new AudioThread();
		VideoThread vt = new VideoThread();
		TimerThread tt = new TimerThread();

		at.start();
		vt.start();
		tt.start();

		System.out.println("main method started");

	}

}
