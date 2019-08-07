package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Description
 *
 * @author zoup
 */
public class ChessPieceFactory {
    private static Map<String, ChessPiece> pool = new HashMap<>();

    public static ChessPiece getChessPiece(String color) {
        ChessPiece chessPiece = pool.get(color);
        if (chessPiece == null) {
            chessPiece = new ChessPiece(color);
            pool.put(color, chessPiece);
            System.out.println("Return new chess piece:" + chessPiece.color);
            return chessPiece;
        }

        System.out.println("Return exist chess piece:" + chessPiece.color);
        return chessPiece;
    }

}
