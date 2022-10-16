/* Copyright (C) 2022 Napat Sutthiwong, Natthachaimongkol Chayopathum, Pathtita Somboonyingsuk, Chayaphol Tangnititham   - All Rights Reserved
 * You may use, distribute and modify this code under the terms of the ICT license.
 */
package test;

import com.zetcode.Shape;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ShapeTest extends Shape{

    @Test
    public void testX(){
        var shape = new Shape();
        //coords = new int[][]{{0, 0}, {0, 0}, {0, 0}, {0, 0}};
        assertEquals(0, shape.x(0));

        while(true){
            if(shape.getShape() == Tetrominoe.ZShape){
                //coords = new int[][]{{ 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 }};
                assertEquals(-1, shape.x(3));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.SShape){
                //coords = new int[][]{ { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } };
                assertEquals(1, shape.x(3));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.LineShape){
                //coords = new int[][]{ { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } };
                assertEquals(0, shape.x(3));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.TShape){
                //coords = new int[][]{ { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } };
                assertEquals(0, shape.x(3));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.SquareShape){
                //coords = new int[][]{ { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } };
                assertEquals(1, shape.x(3));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.LShape){
                //coords = new int[][]{ { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } };
                assertEquals(0, shape.x(3));
                assertThrows(ArrayIndexOutOfBoundsException.class,
                        ()->{shape.x(4);});
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.MirroredLShape){
                //coords = new int[][]{ { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } };
                assertEquals(0, shape.x(3));
                break;
            }
            shape.setRandomShape();
        }
    }

    @Test
    public void testY(){
        var shape = new Shape();
        //coords = new int[][]{{0, 0}, {0, 0}, {0, 0}, {0, 0}};
        assertEquals(0, shape.x(0));

        while(true){
            if(shape.getShape() == Tetrominoe.ZShape){
                //coords = new int[][]{{ 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 }};
                assertEquals(-1, shape.y(0));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.SShape){
                //coords = new int[][]{ { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } };
                assertEquals(-1, shape.y(0));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.LineShape){
                //coords = new int[][]{ { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } };
                assertEquals(-1, shape.y(0));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.TShape){
                //coords = new int[][]{ { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } };
                assertEquals(0, shape.y(0));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.SquareShape){
                //coords = new int[][]{ { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } };
                assertEquals(0, shape.y(0));
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.LShape){
                //coords = new int[][]{ { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } };
                assertEquals(-1, shape.y(0));
                assertThrows(ArrayIndexOutOfBoundsException.class,
                        ()->{shape.y(4);});
                break;
            }
            shape.setRandomShape();
        }
        while(true){
            if(shape.getShape() == Tetrominoe.MirroredLShape){
                //coords = new int[][]{ { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } };
                assertEquals(-1, shape.y(0));
                break;
            }
            shape.setRandomShape();
        }
    }

    @Test
    public void testMinX() {
        var shape = new Shape();
        // if shape is NoShape
        assertEquals(0, shape.minX());
        // if shape is ZShape
        while(true){
            if(shape.getShape() == Tetrominoe.ZShape){
                assertEquals(-1, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
        // if shape is SShape
        while(true){
            if(shape.getShape() == Tetrominoe.SShape){
                assertEquals(0, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
        // if shape is LineShape
        while(true){
            if(shape.getShape() == Tetrominoe.LineShape){
                assertEquals(0, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
        // if shape is TShape
        while(true){
            if(shape.getShape() == Tetrominoe.TShape){
                assertEquals(-1, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
        // if shape is SquareShape
        while(true){
            if(shape.getShape() == Tetrominoe.SquareShape){
                assertEquals(0, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
        // if shape is LShape
        while(true){
            if(shape.getShape() == Tetrominoe.LShape){
                assertEquals(-1, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
        // if shape is MirroredShape
        while(true){
            if(shape.getShape() == Tetrominoe.MirroredLShape){
                assertEquals(0, shape.minX());
                break;
            }
            shape.setRandomShape();
        }
    }

    @Test
    public void testMinY() {
        var shape = new Shape();
        // if shape is NoShape
        assertEquals(0, shape.minY());
        while(shape.getShape() != Tetrominoe.ZShape){
            shape.setRandomShape();
        }
        // if shape is ZShape
        assertEquals(-1, shape.minY());
        while(shape.getShape() != Tetrominoe.SShape){
            shape.setRandomShape();
        }
        // if shape is SShape
        assertEquals(-1, shape.minY());
        while(shape.getShape() != Tetrominoe.LineShape){
            shape.setRandomShape();
        }
        // if shape is LineShape
        assertEquals(-1, shape.minY());
        while(shape.getShape() != Tetrominoe.TShape){
            shape.setRandomShape();
        }
        // if shape is TShape
        assertEquals(0, shape.minY());
        while(shape.getShape() != Tetrominoe.SquareShape){
            shape.setRandomShape();
        }
        // if shape is SquareShape
        assertEquals(0, shape.minY());
        while(shape.getShape() != Tetrominoe.LShape){
            shape.setRandomShape();
        }
        // if shape is LShape
        assertEquals(-1, shape.minY());
        while(shape.getShape() != Tetrominoe.MirroredLShape){
            shape.setRandomShape();
        }
        // if shape is MirroredShape
        assertEquals(-1, shape.minY());
    }

    @Test
    public void testRotateLeft() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Shape shape = new Shape();
        Method setShape = shape.getClass().getDeclaredMethod("setShape", Tetrominoe.class);
        setShape.setAccessible(true);

        // Test 1: NoShape
        setShape.invoke(shape, Tetrominoe.NoShape);
        Shape result = shape.rotateLeft();
        Field field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        int[][] expected = new int[][]{ { 0, 0},  { 0, 0 },  { 0, 0 },   { 0, 0 } };
        int[][] actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 2: ZShape
        setShape.invoke(shape, Tetrominoe.ZShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { -1, 0 },  { 0, 0 },   { 0, 1 },  { 1, 1 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 3: SShape
        setShape.invoke(shape, Tetrominoe.SShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { -1, 0 },  { 0, 0 },   { 0, -1 },   { 1, -1 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 4: LineShape
        setShape.invoke(shape, Tetrominoe.LineShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { -1, 0 },  { 0, 0 },   { 1, 0 },   { 2, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 5: TShape
        setShape.invoke(shape, Tetrominoe.TShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 0, 1 },  { 0, 0 },   { 0, -1 },   { 1, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 6: SquareShape
        setShape.invoke(shape, Tetrominoe.SquareShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 7: LShape
        setShape.invoke(shape, Tetrominoe.LShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { -1, 1 }, { -1, 0 },  { 0, 0 },   { 1, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 8: MirroredShape
        setShape.invoke(shape, Tetrominoe.MirroredLShape);
        result = shape.rotateLeft();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { -1, -1 },  { -1, 0 },  { 0, 0 },   { 1, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public void testRotateRight() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Shape shape = new Shape();
        Method setShape = shape.getClass().getDeclaredMethod("setShape", Tetrominoe.class);
        setShape.setAccessible(true);

        // Test 1: NoShape
        setShape.invoke(shape, Tetrominoe.NoShape);
        Shape result = shape.rotateRight();
        Field field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        int[][] expected = new int[][]{ { 0, 0},  { 0, 0 },  { 0, 0 },   { 0, 0 } };
        int[][] actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 2: ZShape
        setShape.invoke(shape, Tetrominoe.ZShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 1, 0 },  { 0, 0 },   { 0,-1 },  { -1, -1 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 3: SShape
        setShape.invoke(shape, Tetrominoe.SShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 1, 0 },  { 0, 0 },   { 0, 1 },   { -1, 1 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 4: LineShape
        setShape.invoke(shape, Tetrominoe.LineShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 1, 0 },  { 0, 0 },   { -1, 0 },   { -2, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 5: TShape
        setShape.invoke(shape, Tetrominoe.TShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 0, -1 },  { 0, 0 },   { 0, 1 },   { -1, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 6: SquareShape
        setShape.invoke(shape, Tetrominoe.SquareShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 7: LShape
        setShape.invoke(shape, Tetrominoe.LShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 1, -1 }, { 1, 0 },  { 0, 0 },   { -1, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }

        // Test 8: MirroredShape
        setShape.invoke(shape, Tetrominoe.MirroredLShape);
        result = shape.rotateRight();
        field = result.getClass().getDeclaredField("coords");
        field.setAccessible(true);
        expected = new int[][]{ { 1, 1 },  { 1, 0 },  { 0, 0 },   { -1, 0 } };
        actual = (int[][]) field.get(result);
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public void testGetShape() throws NoSuchFieldException, IllegalAccessException {
        Shape shape = new Shape();
        shape.getShape();
        assertEquals(Tetrominoe.NoShape,shape.getShape());

        Field field = shape.getClass().getDeclaredField("pieceShape");
        field.setAccessible(true);

        field.set(shape, Tetrominoe.ZShape);
        shape.getShape();
        assertEquals(Tetrominoe.ZShape,shape.getShape());

        field.set(shape, Tetrominoe.SShape);
        shape.getShape();
        assertEquals(Tetrominoe.SShape,shape.getShape());

        field.set(shape, Tetrominoe.LShape);
        shape.getShape();
        assertEquals(Tetrominoe.LShape,shape.getShape());

        field.set(shape, Tetrominoe.TShape);
        shape.getShape();
        assertEquals(Tetrominoe.TShape,shape.getShape());

        field.set(shape, Tetrominoe.MirroredLShape);
        shape.getShape();
        assertEquals(Tetrominoe.MirroredLShape,shape.getShape());

        field.set(shape, Tetrominoe.SquareShape);
        shape.getShape();
        assertEquals(Tetrominoe.SquareShape,shape.getShape());

        field.set(shape, Tetrominoe.LineShape);
        shape.getShape();
        assertEquals(Tetrominoe.LineShape,shape.getShape());
    }

}
