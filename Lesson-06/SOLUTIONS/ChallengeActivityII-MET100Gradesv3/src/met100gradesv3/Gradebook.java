package met100gradesv3;

public class Gradebook {

    public final int maxPoints = 450;
    private int _e1, _e2, _e3;
    private String _name;
    
    public Gradebook(String name, int exam1, int exam2, int exam3 ) { 
        // TODO: set the exam scores
        this._name=name;
        this._e1=exam1;
        this._e2=exam2;
        this._e3=exam3;
    }
    
    public String studentName() {
        // TODO: return student's name
        return _name;
    }
    
    public int totalPoints() {
        // TODO: calculate the total points 
        return (_e1 + _e2 + _e3);
    }
    
    public double finalAverage() {
        // TODO: calculate the final average 
        return (100.0 * this.totalPoints()/this.maxPoints);
    }
        
}
