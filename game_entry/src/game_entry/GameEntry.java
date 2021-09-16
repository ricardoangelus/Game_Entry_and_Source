package game_entry;

public class GameEntry {
	protected String name;
	protected int score;
	
	/** Construtor que cria um registro do jogo */
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	/** Recupera o campo nome */
	public String getName() { return name; }
	
	/** Recupera o campo score **/
	public int getScore() { return score; }
	
	/** Retorna uma string com a representação deste registro **/
	public String toString() { return "(" + name + ", " + score + ")";}
}
