package test;

import com.zetcode.Board;
import com.zetcode.Shape;
import com.zetcode.Tetris;
import org.junit.Test;

import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class BoardTest extends Shape{

    @Test
    public void testTryMove() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Tetris tetris = new Tetris();
        Board board = new Board(tetris);
        Shape shape = new Shape();

        // setup board
        Method start = board.getClass().getDeclaredMethod("start");
        start.setAccessible(true);
        start.invoke(board);

        // 1st test
        Method method = board.getClass().getDeclaredMethod("tryMove", Shape.class, int.class, int.class);
        method.setAccessible(true);
        Object result1 = method.invoke(board, shape, 9, 21);
        assertEquals(true, result1);

        // 2nd test
        while(shape.getShape() != Tetrominoe.ZShape){
            shape.setRandomShape();
        }
        Object result2 = method.invoke(board, shape, -5, 50);
        assertEquals(false, result2);

        // 3rd test
        while(shape.getShape() != Tetrominoe.SShape){
            shape.setRandomShape();
        }
        Object result3 = method.invoke(board, shape, 5, 5);
        assertEquals(true, result3);

        // 4th test
        while(shape.getShape() != Tetrominoe.LineShape){
            shape.setRandomShape();
        }
        Object result4 = method.invoke(board, shape, 5, 5);
        assertEquals(true, result4);

        // 5th test
        while(shape.getShape() != Tetrominoe.TShape){
            shape.setRandomShape();
        }
        Object result5 = method.invoke(board, shape, 5, 5);
        assertEquals(true, result5);

        // 6th test
        while(shape.getShape() != Tetrominoe.SquareShape){
            shape.setRandomShape();
        }
        Object result6 = method.invoke(board, shape, 5, 5);
        assertEquals(true, result6);

        // 7th test
        while(shape.getShape() != Tetrominoe.LShape){
            shape.setRandomShape();
        }
        Object result7 = method.invoke(board, shape, 5, 5);
        assertEquals(true, result7);

        // 8th test
        while(shape.getShape() != Tetrominoe.MirroredLShape){
            shape.setRandomShape();
        }
        Object result8 = method.invoke(board, shape, 9, 21);
        assertEquals(false, result8);

    }

}
