package come.masai.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import come.masai.Developer;
import come.masai.Project;

public class DeveloperService {
	private Map<Developer, Project> projectMap; // inject 3 entries with valid details 

	private List<Developer> developerList; // inject List of 5 Developer object
	
	
	public Map<Developer, Project> getProjectMap() {
		return projectMap;
	}

	public void setProjectMap(Map<Developer, Project> projectMap) {
		this.projectMap = projectMap;
	}

	public List<Developer> getDeveloperList() {
		return developerList;
	}

	public void setDeveloperList(List<Developer> developerList) {
		this.developerList = developerList;
	}

	public void printProjectMap(){
		for(Map.Entry<Developer, Project> entry:projectMap.entrySet())
		{
			Developer dev=entry.getKey();
			Project pro=entry.getValue();
			System.out.println("Devloper: "+dev.getName()+ "Id:  "+dev.getId());
			System.out.println("Project: "+pro.getName()+" Id: "+pro.getId());
			System.out.println("Duration: "+pro.getDuration()+" month\n");
		}
			
	}
	
	public void printDeveloperList(){
			// sort the List of Developers according to the decreasing order of the noOfProjects Done 
			// If No of the project are same then sort by age
			// print all the sorted Developer Details
		developerList.sort(Comparator.comparing(Developer::getNoOfProjectDone).thenComparing(Developer::getAge).reversed());
		for(Developer dev:developerList)
		{
			System.out.println("Id: "+dev.getId());
			System.out.println("Name: "+dev.getName());
			System.out.println("Age: "+dev.getAge());
			System.out.println("No of Project Done: "+dev.getNoOfProjectDone());
			System.out.println("Mobile: "+dev.getMobile());
			System.out.println("Email: "+dev.getEmail());
		}
	}


}
