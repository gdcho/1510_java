package q2;

import java.util.Arrays;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author David
 * @version 2023
 */
public class TimesheetRow {
    
    private static final long[] MASK = {0xFFL, 0xFF00L, 
        0xFF0000L, 0xFF000000L, 0xFF00000000L, 
        0xFF0000000000L, 0xFF000000000000L};
        
    private static final long[] UMASK = {0xFFFFFFFFFFFFFF00L, 
        0xFFFFFFFFFFFF00FFL, 0xFFFFFFFFFF00FFFFL, 
        0xFFFFFFFF00FFFFFFL, 0xFFFFFF00FFFFFFFFL, 
        0xFFFF00FFFFFFFFFFL, 0xFF00FFFFFFFFFFFFL};
        
    private int project;
    
    private String workPackage;
    
    private long hours;

    public TimesheetRow() {
    }

    public TimesheetRow(int project, String workPackage, float... hours) {
        this.project = project;
        this.workPackage = workPackage;
        for (int i = 0; i < hours.length; i++) {
            setHour(i, hours[i]);
        }
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public String getWorkPackage() {
        return workPackage;
    }

    public void setWorkPackage(String workPackage) {
        this.workPackage = workPackage;
    }

    public float getHour(int dayOfWeek) {
        return ((hours & MASK[dayOfWeek]) >> (dayOfWeek * 8)) / 10f;
    }

    public void setHour(int dayOfWeek, float hour) {
        long decihours = (long) (hour * 10);
        hours = (hours & UMASK[dayOfWeek]) | (decihours << (dayOfWeek * 8));
    }

    @Override
    public String toString() {
        float[] dailyHours = new float[7];
        for (int i = 0; i < 7; i++) {
            dailyHours[i] = getHour(i);
        }
        return "TimesheetRow{" +
                "project=" + project +
                ", workPackage='" + workPackage + '\'' +
                ", hours=" + Arrays.toString(dailyHours) +
                '}';
    }
    
}
