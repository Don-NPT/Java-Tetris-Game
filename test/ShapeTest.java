/* Copyright (C) 2022 Napat Sutthiwong - All Rights Reserved
* You may use, distribute and modify this code under the terms of the MIT license.
*/
package test;

import com.zetcode.Board;
import com.zetcode.Shape;
import org.junit.Test;

import java.awt.event.KeyEvent;

import static org.junit.Assert.*;

public class ShapeTest extends Shape{

    @Test
    public void testInitShape() {
        var shape = new Shape();
        assertEquals(Tetrominoe.NoShape, shape.getShape());
    }

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

}
