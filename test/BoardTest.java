/* Copyright (C) 2022 Napat Sutthiwong, Natthachaimongkol Chayopathum, Pathtita Somboonyingsuk, Chayaphol Tangnititham   - All Rights Reserved
 * You may use, distribute and modify this code under the terms of the ICT license.
 */

package test;

import com.zetcode.Board;
import com.zetcode.Shape;
import com.zetcode.Tetris;
import org.junit.Test;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

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

    @Test
    public void testShapeAt() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Tetris tetris = new Tetris();
        Board board = new Board(tetris);

        // setup board
        Method start = board.getClass().getDeclaredMethod("start");
        start.setAccessible(true);
        start.invoke(board);

        // 1st test
        Method method = board.getClass().getDeclaredMethod("shapeAt", int.class, int.class);
        method.setAccessible(true);
        Object result1 = method.invoke(board, 0, 0);
        assertEquals(Tetrominoe.NoShape, result1);

        // 2nd test
        Field field = board.getClass().getDeclaredField("board");
        field.setAccessible(true);
        Tetrominoe[] temp = (Tetrominoe[]) field.get(board);
        for (int i = 0; i < 22 * 10; i++) {

            temp[i] = Tetrominoe.ZShape;
        }
        Object result2 = method.invoke(board, 10, 20);
        assertNotEquals(Tetrominoe.NoShape, result2);

        // 3rd test
        Tetrominoe[] temp2 = (Tetrominoe[]) field.get(board);
        for (int i = 0; i < 22 * 10; i++) {

            temp2[i] = Tetrominoe.ZShape;
        }
        assertThrows(java.lang.reflect.InvocationTargetException.class, () -> {
            method.invoke(board, 20, 22);
        });

        // 4rd test
        assertThrows(java.lang.reflect.InvocationTargetException.class, () -> {
            method.invoke(board, 20, 22);
        });
    }

    @Test
    public void testPause() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Tetris tetris = new Tetris();
        Board board = new Board(tetris);

        Method pause = board.getClass().getDeclaredMethod("pause");
        pause.setAccessible(true);
        pause.invoke(board);

        Field field = board.getClass().getDeclaredField("statusbar");
        field.setAccessible(true);

        JLabel str = (JLabel)field.get(board);
        assertEquals("paused",str.getText());

        pause.invoke(board);
        assertEquals("0",str.getText());
    }

}
