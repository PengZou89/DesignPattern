import FlyweightPattern.ChessPiece;
import FlyweightPattern.ChessPieceFactory;
import org.junit.Test;

/**
 * Class Description
 *
 * @author zoup
 */
public class FlyweightPatternTest {

    @Test
    public void test() {
        ChessPiece chessPiece = ChessPieceFactory.getChessPiece("Black");
        chessPiece.setLocation(1, 10);
        chessPiece.putdown();

        chessPiece = ChessPieceFactory.getChessPiece("White");
        chessPiece.setLocation(2, 10);
        chessPiece.putdown();

        chessPiece = ChessPieceFactory.getChessPiece("Black");
        chessPiece.setLocation(3, 10);
        chessPiece.putdown();

        chessPiece = ChessPieceFactory.getChessPiece("White");
        chessPiece.setLocation(4, 10);
        chessPiece.putdown();

    }
}
