/**
 An interface for Go games
 
 @author David Winkenwerder and Dustin Henderson
 @author Keith Waldron and Nick Abrahan
 @author Jeffrey Liu and Lauren Dumapias
 @version CS56 2/21/16
 @see GoGrid
 @see GoComponent
 @see Go
 */

<<<<<<< HEAD
    /** used to set the turn
     */
    public void setTurn(char turn);

    /** is this square blank.  Should be called before move() to see
	whether the move is legal.  
	@param i number between 1 and 361 indicating square
	@return whether square is blank or not.
    */
    public boolean isBlank(int i);

    /**	play the next move. if isBlank(i) is not true, will throw
	GoIllegalMoveException.

	@param i number between 1 and 361 indicating square, 
	       organized like a telephone grid.  If i is already occupied,
	       a GoMoveException is thrown.
	@return winner 'B', 'W', or 'D' for draw, or ' ' for none yet.
     */
//    public char move(int i) throws GoIllegalMoveException;

    public boolean makeMove(int i) throws GoIllegalMoveException;

    /** Allows the game to end when both parties are surrendering
     */
    public char getWinner();

    /** Allows to set surrendering condition true
     */
    public void setSurrendering();

    public void restart();

    public String toString();
    
    public char charAt(int i);

    public boolean getSurrender1();

 //   public void setGameStatus(boolean boo);
    
    public void setSurrender1(boolean boo);
    
    public boolean getSurrender2();
    
    public void setSurrender2(boolean boo);

    public char setWinner(char a);
    
    public boolean checkSurrounded(int num, char color);

    public boolean checkSurrounded2(int num);

    public void changeTurn();

    public void setGrid(int i, char c);

    public int getWScore();

    public int getBScore();

    public boolean skip();

}
=======
public interface GoGame
    {
        /** returns 'B' or 'W' depending on whose turn it is.  Returns ' ' if game over.
         */
        public char getTurn();
        
        /** used to set the turn
         */
        public void setTurn(char turn);
        
        /** is this square blank.  Should be called before move() to see
         whether the move is legal.
         @param i number between 1 and 361 indicating square
         @return whether square is blank or not.
         */
        public boolean isBlank(int i);
        
        /**	play the next move. if isBlank(i) is not true, will throw
         GoIllegalMoveException.
         
         @param i number between 1 and 361 indicating square,
         organized like a telephone grid.  If i is already occupied,
         a GoMoveException is thrown.
         @return winner 'B', 'W', or 'D' for draw, or ' ' for none yet.
         */
        
        public boolean makeMove(int i) throws GoIllegalMoveException;
        
        // Allows the game to end when both parties are surrendering
        public char getWinner();
        
        // Allows to set surrendering condition true
        public void setSurrendering();
        
        public void restart();
        
        public String toString();
        
        public char charAt(int i);
        
        public boolean getSurrender1();
        
        public void setSurrender1(boolean boo);
        
        public boolean getSurrender2();
        
        public void setSurrender2(boolean boo);
        
        public char setWinner(char a);
        
        public boolean checkSurrounded(int num, char color);
        
        public boolean checkSurrounded2(int num);
        
        public void changeTurn();
        
        public void setGrid(int i, char c);
        
        public int getWScore();
        
        public int getBScore();
        
        
    }
>>>>>>> f2ad7bd64c8a3c5aa0da85c9517a969c8d76b755
