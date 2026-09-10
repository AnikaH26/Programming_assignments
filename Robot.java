public class Robot { //Robot class
    //public fields:
    public String teamName;
    public int teamNumber;
    //private fields:
    private int ballsScored;
    private int climbLevel;
    //constructor:
    public Robot(int teamNumber,String teamName) {
        this.teamName= teamName;
        this.teamNumber= teamNumber;
        this.ballsScored=0; // intialized to 0
        this.climbLevel=0;  // initialized to 0
    }
    //public methods for ballsScored and climbLevel:
    public void addBallsScored(int balls){
        if (balls>0){
            this.ballsScored+=balls;
    } 
}
    public void reachedClimbLevel(int level){
        this.climbLevel=level;

    }
    public int TotalScore(){
        return this.climbLevel+this.ballsScored;
    }
}
    



    

