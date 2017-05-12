
// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID: it3-2015

public class PlanetExplorer {
	private int gridX;
	private int gridY;
	private String obstacles;
	private char smer;
	private int pos_x=0;
	private int pos_y=0;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" 
	 *  with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
	 */
		this.gridX=x;
		this.gridY=y;
		this.obstacles=obstacles;
		
	}
	public PlanetExplorer(int x, int y, String obstacles,char smer){
		this.gridX=x;
		this.gridY=y;
		this.obstacles=obstacles;
		this.smer=smer;
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)
		 * ..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the
		 *  explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates
		 *  of the encountered obstacles. No white spaces.
		 */
		
		/*String [] niz_prepreka = obstacles.split(",");
		for (int i = 0; i < niz_prepreka.length; i++) {
			System.out.println(niz_prepreka[i]);
		}*/
		
		char [] kretanja = command.toCharArray();
		for (int i = 0; i < kretanja.length; i++) {
			System.out.println(kretanja[i]);
		}
		
		for (int j = 0; j < kretanja.length; j++) {
			if(smer=='N'){
				switch(kretanja[j]){
				case 'f':
					this.pos_x++;
					getPosition();
				case 'b':
					this.pos_x--;
					getPosition();
				}
				
			}
			
		}
		
		//PlanetExplorer pe = new PlanetExplorer(10,10, "f");
		
		return null;
	}
	
	public String getPosition(){
		return "("+this.pos_x+","+this.pos_y+")";
	}

	public int getGridX() {
		return gridX;
	}

	public void setGridX(int gridX) {
		this.gridX = gridX;
	}

	public int getGridY() {
		return gridY;
	}

	public void setGridY(int gridY) {
		this.gridY = gridY;
	}

	public String getObstacles() {
		return obstacles;
	}

	public void setObstacles(String obstacles) {
		this.obstacles = obstacles;
	}

	public char getSmer() {
		return smer;
	}

	public void setSmer(char smer) {
		this.smer = smer;
	}
}
