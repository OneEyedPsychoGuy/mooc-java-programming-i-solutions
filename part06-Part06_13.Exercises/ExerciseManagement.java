import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseNames = new ArrayList<>();
        for (Exercise exercise : this.exercises) {
            exerciseNames.add(exercise.getName());
        }
        return exerciseNames;
    }

    public void add(String exerciseName) {
        this.exercises.add(new Exercise(exerciseName));
    }

    public void markAsCompleted(String exerciseName) {
        for (Exercise exercise : this.exercises) {
            if(exercise.getName().equals(exerciseName)) {
                exercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exerciseName) {
        for(Exercise exercise : this.exercises) {
            if(exercise.getName().equals(exerciseName)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}