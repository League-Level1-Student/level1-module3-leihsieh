package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		
		World w = new World();
		Bug b = new Bug();
		Location l = new Location(0,0);
		w.add(l, b);
		
		Flower fl = new Flower();
		
		for(int i = 1; i < 10; i++) {
			Location l2 = new Location(0,i);
			w.add(l2, fl);
		}
		for(int y = 1; y < 5; y++) {
			for(int x = 0; x < 10; x++) {
				Location l2 = new Location(y,x);
				w.add(l2, fl);
			}
		}
		for(int a = 0; a < 7; a++) {
			Location l2 = new Location(5, a);
			w.add(l2, fl);
		}
		for(int c = 8; c < 10; c++) {
			Location l2 = new Location(5, c);
			w.add(l2, fl);
		}
		for(int e = 6; e < 10; e++) {
			for(int d = 0; d < 10; d++) {
				Location l2 = new Location(e,d);
				w.add(l2, fl);
			}
		}
		
		Bug bl = new Bug(Color.blue);
		bl.turn();
		bl.turn();
		Location lr = new Location(5, 7);
		w.add(lr, bl);
		
		
		w.show();
	}
	
}
