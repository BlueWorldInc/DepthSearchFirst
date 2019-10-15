package com.inti.formation;

import lombok.Data;

@Data
public class DSF {
	
	private static void DsfExec(Node FirstNode) {
		
		Node actualNode = FirstNode;
		
		while(!actualNode.isVisited()) {
			System.out.println(actualNode.getNodeLetter());
			actualNode.setVisited(true);
		}
		
		
	}

}
