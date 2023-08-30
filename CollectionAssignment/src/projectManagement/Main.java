package projectManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
    private static Map<String, Project> projects = new HashMap<>();


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		 while (true) {
	            System.out.println("1. Add Project");
	            System.out.println("2. Assign Team Member to Project");
	            System.out.println("3. View Project");
	            System.out.println("4. List All Projects");
	            System.out.println("5. Exit");
	            int choice = scan.nextInt();
	            scan.nextLine();
	            
	            switch(choice) {
	            case 1 : 
	            	addProject(scan);
	            	break;
	            case 2 :
	            	assignProject(scan);
	            	break;
	            case 3 :
	            	viewProject(scan);
	            	break;
	            case 4 :
	            	listProjects();
	            	break;
	            case 5:
	                System.exit(0);
	            default :
	            	System.out.println("Invalid choice");
	            }
		 }
	}
	
	public static void addProject(Scanner scan) {
		 System.out.println("Enter Project Name: ");
         String name = scan.nextLine();
         System.out.println("Enter Project Description: ");
         String description = scan.nextLine();
         Project project = new Project(description);
         projects.put(name, project);
	}
	
	public static void assignProject(Scanner scan) {
		 System.out.println("Enter Project Name: ");
         String assignProjectName = scan.nextLine();
         Project assignProject = projects.get(assignProjectName);
         if (assignProject != null) {
             System.out.println("Enter Team Member Name: ");
             String name = scan.nextLine();
             assignProject.addTeamMember(name);
         } else {
             System.out.println("Project not found.");
         }
	}
	
	public static void viewProject(Scanner scan) {
		System.out.println("Enter Project Name: ");
        String name = scan.nextLine();
        Project project = projects.get(name);
        if (project != null) {
            System.out.println("Project Name: " + name +
                               "\nDescription: " + project.getDescription() +
                               "\nTeamMembers: " + project.getTeamMembers());
        } else {
            System.out.println("Project not found.");
        }
	}
	
	public static void listProjects() {
		for (String name : projects.keySet()) {
            System.out.println(name + " : " + projects.get(name));
        }
	}
		
}
