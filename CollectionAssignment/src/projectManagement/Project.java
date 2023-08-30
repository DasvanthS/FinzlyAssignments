package projectManagement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Project {
	
	    private String description;
	    private Set<String> teamMembers;

	    public Project(String description) {
	        this.description = description;
	        this.teamMembers = new HashSet<>();
	    }

	    public String getDescription() {
	        return description;
	    }

	    public Set<String> getTeamMembers() {
	        return teamMembers;
	    }

	    public void addTeamMember(String teamMember) {
	        teamMembers.add(teamMember);
	    }

		@Override
		public String toString() {
			return "Project [description=" + description + ", teamMembers=" + teamMembers + "]";
		}
	    
	    

	    
}
