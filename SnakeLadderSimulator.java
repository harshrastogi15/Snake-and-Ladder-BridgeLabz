import java.util.*;

class SnakeLadderSimulator{

    public static ArrayList<Integer> board = new ArrayList<Integer>(101);

    // UC2 - Roll the Dice
    public static Integer rollDice(){
        Integer rdm = (int)((Math.ceil(Math.random()*10))%6 + 1);
        return rdm;
    }

    // UC3 - Design Board
    public static void designBoard(){
        for( Integer i=0; i<101; i++){
            board.add(-1);
        }

        // Ladder in the board
        board.set(2, 21);
        board.set(5, 7);
        board.set(10, 75);
        board.set(12, 38);

        // Snake in the board
        board.set(26, 0);
        board.set(21, 8);
        board.set(16, 3);
        board.set(18, 6);
        board.set(99, 10);

    }

    public static ArrayList<Integer> option(Integer currPosition){

        Integer situation = board.get(currPosition);
        ArrayList<Integer> result = new ArrayList<Integer>(2);
        if(situation == -1){
            result.add(0); // No option - neither snake nor ladder
            result.add(currPosition);
        }else if(situation > currPosition){
            result.add(1); // ladder
            result.add(situation);
        }else{
            result.add(2); // snake;
            result.add(situation);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder game");
        designBoard();

        Integer positionOfFirstPlayer = 99;
        System.out.println(positionOfFirstPlayer);
        System.out.println(rollDice());

        ArrayList<Integer> result = option(positionOfFirstPlayer);
        System.out.println(result);
    }
}
