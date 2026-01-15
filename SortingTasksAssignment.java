import java.util.Collections;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
//Make ArrayList with tasks and add stuff to it
public class Main {
    public static void main(String[] args) {
        ArrayList<Task> myTasks = new ArrayList<>();
        myTasks.add(new Task(3, "Clean room", 2));
        myTasks.add(new Task(1, "Do laundry", 4));
        myTasks.add(new Task(2, "Take out trash", 1));
        myTasks.add(new Task(3, "Wash dishes", 3));
        System.out.println("Here are my tasks!\n"
                + "\nBefore sorting: \n" + myTasks);
        Collections.sort(myTasks);
        System.out.println("\nSorting by priority: \n" + myTasks);
    }
}
//the class used to make the objects in the ArrayList
class Task implements Priority,Complexity,Comparable<Task>
{
    private String taskName;
    private int priority;
    private int complexity;
  //assigns values to the variables in the class
    public Task(int priority, String taskName, int complexity) {
        this.taskName = taskName;
        setPriority(priority);
        setComplexity(complexity);
    }
    public String getTaskName() {
        return taskName;
    }
    public int getPriority() {
        return priority;
    }
    public int getComplexity() {
        return complexity;
    }
    public void setComplexity(int complexity){
        this.complexity = complexity;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
  //orders by priority, then by complexity
    public int compareTo(Task otherTask){
        if (this.priority == otherTask.getPriority()){
            return Integer.compare(this.complexity, otherTask.getComplexity());
        } else {
            return Integer.compare(this.priority, otherTask.getPriority());
        }

    }
//the way the tasks are printed in the console
    public String toString() {
        return taskName + ": Priority of " + priority + " and Complexity of " + complexity;
    }
}
interface Priority
{
    public void setPriority(int inPriority);
    public int getPriority();
}
interface Complexity
{
    public void setComplexity(int complexity);
    public int getComplexity();
}
