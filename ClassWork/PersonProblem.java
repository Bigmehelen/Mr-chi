public class PersonProblem{

	private List<Problems> problem;
	
	public PersonProblem(List<Problems> problem){
	this.problem = problem;

	}

	public void addProblem(String theProblem){
		problem.add(theProblem);
	}
	
	public void solveProblem(PersonProblem problem){
		problem.toggleFlag();
	}

	public List<Problems> tellProblem(){
		return problem;

	}
}