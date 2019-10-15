package com.inti.formation;

import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		Node A = new Node('A');
		Node B = new Node('B');
		Node C = new Node('C');
		Node D = new Node('D');
		Node E = new Node('E');
		Node F = new Node('F');
		Node G = new Node('G');
		Node H = new Node('H');
		
		A.addNeighbord(B);
		B.addNeighbord(C);
		B.addNeighbord(D);
		D.addNeighbord(E);
		A.addNeighbord(F);
		A.addNeighbord(G);
		G.addNeighbord(H);
		
	}

}
