public class ProblemDescription{

	private String name;
	private ProblemType problemType;
	private boolean isSolved;

	
	public problemDescription(String name, ProblemType problemType){
		this.name = name;
		this.problemType = problemType;
		this.isSolved = false;

	}

	
	public void toggleFlag(){
		isSolved == true;	
	}

}