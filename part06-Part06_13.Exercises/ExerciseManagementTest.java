import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement manager;

    @Before
    public void initialize() {
        this.manager = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, this.manager.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        this.manager.add("Write a test");
        assertEquals(1, this.manager.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        this.manager.add("Write a test");
        assertTrue(this.manager.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        this.manager.add("New exercise");
        this.manager.markAsCompleted("New exercise");
        assertTrue(this.manager.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        this.manager.add("New exercise");
        this.manager.markAsCompleted("New exercise");
        assertFalse(this.manager.isCompleted("Some exercise"));
    }
}