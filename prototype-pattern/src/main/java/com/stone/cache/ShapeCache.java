package com.stone.cache;

import com.stone.entity.Circle;
import com.stone.entity.Rectangle;
import com.stone.entity.Shape;
import com.stone.entity.Square;

import java.util.Hashtable;

/**
 * @author Jeff
 * <p>
 * 形状缓存，创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeHashtable.get(shapeId);
        return cachedShape.clone();
    }

    /**
     * 模拟从数据库中查询数据，并且添加值缓存中
     * shapeHashtable.put(shapeKey, shape);
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }
}
