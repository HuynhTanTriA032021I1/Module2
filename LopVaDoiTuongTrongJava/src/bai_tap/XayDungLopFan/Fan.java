package bai_tap.XayDungLopFan;

public class Fan {
    private int slow;
    private int medium;
    private int fast;

    public Fan(){

    }

    public Fan(int slow, int medium, int fast){
        this.slow = slow;
        this.medium = medium;
        this.fast = fast;
    }

    public int getSlow() {  
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }
}
