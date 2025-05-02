

public class StoryNode {
    public String description;
    public StoryNode[] choices;
    public boolean isEnding;
    public int sceneId;

    public StoryNode(String desc, int maxChoices, int id) {
        description = desc;
        choices = new StoryNode[maxChoices];
        isEnding = false;
        sceneId = id;
    }

    public void addChoice(int index, StoryNode node) {
        if(index >= 0 && index < choices.length) {
            choices[index] = node;
        }
    }
}