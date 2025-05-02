import java.util.Scanner;
import java.util.Stack;

public class StoryGame {
    private StoryNode currentScene;
    private Stack<StoryNode> sceneHistory = new Stack<>();
    private Stack<String> detailedChoices = new Stack<>();
    private Scanner scanner = new Scanner(System.in);

    public StoryGame() {
        StoryTree storyTree = new StoryTree();
        currentScene = storyTree.getRoot();
    }

    public void startGame() {
        System.out.println("🎭 THE ADVENTURE BEGINS...\n");
        displayScene();

        while(!currentScene.isEnding) {
            processChoice();
            displayScene();
        }
        
        showEnding();
        scanner.close();
    }

    private void displayScene() {
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.println(currentScene.description + "\n");
    }

    private void processChoice() {
        System.out.print("⮞ Your choice (back: 0): ");
        String input = scanner.nextLine();
        
        try {
            int choice = Integer.parseInt(input);
            
            if(choice == 0) {
                undoChoice();
            } else {
                makeChoice(choice);
            }
        } catch(NumberFormatException e) {
            System.out.println("✘ Invalid choice!");
        }
    }

    private void makeChoice(int choice) {
        int index = choice - 1;
        if(index >= 0 && index < currentScene.choices.length) {
            if(currentScene.choices[index] != null) {
                saveChoice(currentScene.description, choice);
                sceneHistory.push(currentScene);
                currentScene = currentScene.choices[index];
            } else {
                System.out.println("✘ This path is blocked!");
            }
        } else {
            System.out.println("✘ Choice does not exist!");
        }
    }

    private void saveChoice(String sceneDesc, int choice) {
        String summary = "➤ " + sceneDesc.split("\n")[0];
        detailedChoices.push(summary);
    }

    private void undoChoice() {
        if(!sceneHistory.isEmpty()) {
            currentScene = sceneHistory.pop();
            detailedChoices.pop();
            System.out.println("\n⮜ One step back\n");
        } else {
            System.out.println("✘ No path to go back!");
        }
    }

    private void showEnding() {
        System.out.println("\n★★★★★ GAME OVER ★★★★★");
        
        System.out.print("\nView journey summary? (y/n): ");
        if(scanner.nextLine().equalsIgnoreCase("y")) {
            printJourneySummary();
        }
    }

    private void printJourneySummary() {
        System.out.println("\n=== YOUR JOURNEY SUMMARY ===");
        int step = 1;
        for(String choice : detailedChoices) {
            System.out.println(step++ + ". " + choice);
        }
        System.out.println("⚑ Ending: " + currentScene.description.split("\n")[0]);
    }

    public static void main(String[] args) {
        new StoryGame().startGame();
    }
}
