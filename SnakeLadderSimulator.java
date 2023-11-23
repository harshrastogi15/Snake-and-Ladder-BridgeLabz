class SnakeLadderSimulator{

    // UC2 - Roll the Dice
    public static Integer rollDice(){
        Integer rdm = (int)((Math.ceil(Math.random()*10))%6 + 1);
        return rdm;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder game");
        Integer positionOfFirstPlayer = 0;
        System.out.println(positionOfFirstPlayer);
        System.out.println(rollDice());
    }
}
