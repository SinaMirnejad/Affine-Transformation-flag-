	package Engine;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import Game.*;

public class Main {

	public static FlagMain grid;
	public static int size = 300;
	public static InputHandler IH;
	public static ArrayList<GameObject> elements = new ArrayList<GameObject>();
	public static int fraimes = 0;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		grid  = new FlagMain(size, 2, 3, "Solar-System", "Assets//");
		
		// Add Comp here! -----------------------
		
		GameObject M = new GameObject(null);
		GameObject P0 = M;
		P0.position.SetScale(.5, .5);
		P0.position.SetPosition(1000, 500);
		P0.addGraphicsComponent(new Planet(P0,"P1.png"));
		P0.addLogicComponent(new PlanetLogic(P0));
		
		
		/*
		
		GameObject P1 = new GameObject(P0);
		P1.position.SetScale(.5, .5);
		P1.position.SetPosition(700, 200);
		P1.addGraphicsComponent(new Planet(P1,"P1.png"));
		P1.addLogicComponent(new PlanetLogic(P1));
		
		GameObject P2 = new GameObject(P1);
		P2.position.SetScale(.5, .5);
		P2.position.SetPosition(700, 200);;
		P2.addGraphicsComponent(new Planet(P2,"P1.png"));
		P2.addLogicComponent(new PlanetLogic(P2));
		
		GameObject P3 = new GameObject(P2);
		P3.position.SetScale(.5, .5);
		P3.position.SetPosition(700, 200);;
		P3.addGraphicsComponent(new Planet(P3,"P1.png"));
		P3.addLogicComponent(new PlanetLogic(P3));
		
		GameObject P4 = new GameObject(P3);
		P4.position.SetScale(.5, .5);
		P4.position.SetPosition(700, 200);;
		P4.addGraphicsComponent(new Planet(P4,"P1.png"));
		P4.addLogicComponent(new PlanetLogic(P4));
		*/
		
		double Dist = .9;
		int num = 100;
		GameObject P1;
		
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.7, .7);
			P1.position.SetPosition(500 * Dist, 0 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P1.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		
		P0 = M;
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.7, .7);
			P1.position.SetPosition(-500 * Dist, 0 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P1.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		
		P0 = M;
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.7, .7);
			P1.position.SetPosition(0 * Dist, -500 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P2.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		
		P0 = M;
		for (int i = num; i > 0; i--) {
			
			P1 = new GameObject(P0);
			P1.position.SetScale(.7, .7);
			P1.position.SetPosition(0 * Dist, 500 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P2.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}

		/*
		
		M = new GameObject(null);
		P0 = M;
		P0.position.SetScale(.9, .9);
		P0.position.SetPosition(200, 100);
		P0.addGraphicsComponent(new Planet(P0,"P1.png"));
		P0.addLogicComponent(new PlanetLogic(P0));
		
		
		GameObject P1 = new GameObject(P0);
		P1.position.SetScale(.5, .5);
		P1.position.SetPosition(700, 200);
		P1.addGraphicsComponent(new Planet(P1,"P1.png"));
		P1.addLogicComponent(new PlanetLogic(P1));
		
		GameObject P2 = new GameObject(P1);
		P2.position.SetScale(.5, .5);
		P2.position.SetPosition(700, 200);;
		P2.addGraphicsComponent(new Planet(P2,"P1.png"));
		P2.addLogicComponent(new PlanetLogic(P2));
		
		GameObject P3 = new GameObject(P2);
		P3.position.SetScale(.5, .5);
		P3.position.SetPosition(700, 200);;
		P3.addGraphicsComponent(new Planet(P3,"P1.png"));
		P3.addLogicComponent(new PlanetLogic(P3));
		
		GameObject P4 = new GameObject(P3);
		P4.position.SetScale(.5, .5);
		P4.position.SetPosition(700, 200);;
		P4.addGraphicsComponent(new Planet(P4,"P1.png"));
		P4.addLogicComponent(new PlanetLogic(P4));
		*/
		/*
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.5, .5);
			P1.position.SetPosition(500 * Dist, 0 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P1.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		
		P0 = M;
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.5, .5);
			P1.position.SetPosition(-500 * Dist, 0 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P1.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		
		P0 = M;
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.5, .5);
			P1.position.SetPosition(0 * Dist, -500 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P2.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		
		P0 = M;
		for (int i = num; i > 0; i--) {
			P1 = new GameObject(P0);
			P1.position.SetScale(.5, .5);
			P1.position.SetPosition(0 * Dist, 500 * Dist);
			P1.addGraphicsComponent(new Planet(P1,"P2.png"));
			P1.addLogicComponent(new PlanetLogic(P1));
			P0 = P1;
		}
		*/
		
		
		
		P0 = new GameObject(null);
		P0.position.SetScale(1, 1);
		P0.position.SetPosition(1000, 500);
		P0.addLogicComponent(new CameraControl(P0));
		
		grid.Camera = P0.position;
		
		
		//------------------------------------------
		grid.start();
		
		
	}
	
	
}
