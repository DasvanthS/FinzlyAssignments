package projectManagement;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	    private String description;
	    private List<TeamMember> teamMembers;

	    public Project(String description) {
	        this.description = description;
	        this.teamMembers = new ArrayList<>();
	    }

	    public String getDescription() {
	        return description;
	    }

	    public List<TeamMember> getTeamMembers() {
	        return teamMembers;
	    }

	    public void addTeamMember(TeamMember teamMember) {
	        teamMembers.add(teamMember);
	    }

		@Override
		public String toString() {
			return "Project [description=" + description + ", teamMembers=" + teamMembers + "]";
		}
	    
	    

	    
}
