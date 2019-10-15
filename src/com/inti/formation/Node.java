package com.inti.formation;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node {
	
	private char nodeLetter;
	private boolean visited = false;
	private List<Node> neighbord;
	
	public Node(char nodeLetter) {
		this.nodeLetter = nodeLetter;
	}
	
	public void addNeighbord(Node n) {
		this.neighbord.add(n);
	}
	
}
