import java.util.ArrayList;
public class Board {
    ArrayList<ArrayList<>> Board = new ArrayList<ArrayList<String>>();

   private int rows = 0;
  private   int columns = 0;
    public Board(){
        Board = new ArrayList<ArrayList<String>>();
        rows = 4;
        columns = 4;
        for (int i = 0; i < rows; i++){{
            ArrayList<> row = new ArrayList<>();
            for (int n = 0; n < columns; n++) {
                row.add("-");
            }
            Board.add(row);
        }
        }
    }
    public Board(int rows, int columns){
        Board = new ArrayList<>();
        this.columns = columns;
        this.rows = rows;
        for(int i = 0; i < rows; i++){
            ArrayList<String> row = new ArrayList<>();
            for(int n = 0; n < columns; n++){
                row.add("-");
            }Board.add(row);
        }
    }
    public String printBoard() {
        String toString; {
            String result = "";
            for (int i = 0; i < Board.size(); i++) {
                for (int j = 0; j < Board.get(i).size(); j++) {
                    result += Board.get(i).get(j);
                }
                result += System.lineSeparator();
            }
            System.out.println(result);
            return result;
        }
    }
}


