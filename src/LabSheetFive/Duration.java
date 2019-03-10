package LabSheetFive;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Duration implements Comparable<Duration> {

    /*
    You are required to write a class, named Duration, that can be used to represent the
    duration of an event, such as the length of a track on a CD.
     */

    private final int hours, mins, secs;

    public Duration(){

        this(0, 0, 0);

    }

    public Duration(int hours, int mins, int secs){

        this.hours = hours;
        this.mins = mins;
        this.secs = secs;

    }

    public int getHours(){ return hours; }

    public int getMins() { return mins; }

    public int getSecs() { return secs; }

    public Duration add(Duration d){

        int newSecs;
        int minsCarried = 0;
        int hoursCarried = 0;
        int newMins;

        if(this.secs + d.secs > 60){

            minsCarried = (int)((this.secs + d.secs) / 60);
            newSecs = (this.secs + d.secs) % 60;

        }else{

            newSecs = this.secs + d.secs;

        }

        if(this.mins + d.mins > 60){

            hoursCarried = (int)((this.mins + d.mins) / 60);
            newMins = ((this.mins + d.mins) % 60) + minsCarried;

        }else{

            newMins = this.mins + d.mins;

        }

        int newHours = this.hours + d.hours + hoursCarried;

        return new Duration(newHours, newMins, newSecs);

    }

    @Override
    public String toString(){

        return hours + ";" + mins + ":" + secs;

    }

    @Override
    public int compareTo(Duration d){

        int totalSecondsThis = (this.hours * 60 * 60) + (this.mins * 60) + this.secs;
        int totalSecondsD = (d.hours * 60 * 60) + (d.mins * 60) + d.secs;

        return totalSecondsThis - totalSecondsD;

    }
}
