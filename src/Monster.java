public class Monster {
    private int countEye, countLeg, countHands;

    public Monster()
    {
        countEye = 2;
        countLeg = 2;
        countHands = 2;
    }
    public Monster(int eye)
    {
        this.countEye = eye;
        countLeg = 2;
        countHands = 2;
        System.out.println("E: " + countEye + "\nL: " + countLeg + "\nH: " + countHands);
    }
    public Monster(int eye, int leg)
    {
        this.countEye = eye;
        this.countLeg = leg;
        countHands = 2;
        System.out.println("E: " + countEye + "\nL: " + countLeg + "\nH: " + countHands);
    }
    public Monster(int eye, int leg, int hands)
    {
        this.countEye = eye;
        this.countLeg = leg;
        this.countHands = hands;
        System.out.println("E: " + countEye + "\nL: " + countLeg + "\nH: " + countHands);
    }

    public void voice(){
        System.out.println("Voice!");
    }
    public void voice(int i){
        int num = 0;
        while(num < i){
            System.out.println("Voice!");
            num++;
        }
    }
    public void voice(int i, String word){
        int num = 0;
        while(num < i){
            System.out.println(word);
            num++;
        }
    }
}
