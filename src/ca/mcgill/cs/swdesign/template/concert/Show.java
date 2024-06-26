package ca.mcgill.cs.swdesign.template.concert;

public interface Show extends Iterable<Show> {

    String description();
    int runningTime();
    Show copy();

}
