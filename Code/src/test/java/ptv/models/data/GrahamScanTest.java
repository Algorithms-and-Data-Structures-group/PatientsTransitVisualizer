package ptv.models.data;

import javafx.geometry.Point2D;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class GrahamScanTest {


    @Test
    public void shouldReturnHullForListOfPoints() {
        List<Point2D> given = new ArrayList<>();
        given.add(new Point2D(4,2));
        given.add(new Point2D(2,3));
        given.add(new Point2D(5,5));
        given.add(new Point2D(3,6));
        given.add(new Point2D(8,6));
        given.add(new Point2D(6,4));
        given.add(new Point2D(7,2));

        List<Point2D> got = new ArrayList<>();
        got.add(new Point2D(4, 2));
        got.add(new Point2D(7, 2));
        got.add(new Point2D(8, 6));
        got.add(new Point2D(3, 6));
        got.add(new Point2D(2, 3));

        GrahamScan grahamScan = new GrahamScan();
        grahamScan.setAllPoints(given);
        grahamScan.countGrahamHull();
        Assertions.assertEquals(got, grahamScan.getPolygon());
    }

    @Test
    public void shouldCountWhenSomePointsAreSame() {
        List<Point2D> given = new ArrayList<>();
        given.add(new Point2D(4,2));
        given.add(new Point2D(2,3));
        given.add(new Point2D(5,5));
        given.add(new Point2D(3,6));
        given.add(new Point2D(8,6));
        given.add(new Point2D(6,4));
        given.add(new Point2D(7,2));
        given.add(new Point2D(5, 5));
        given.add(new Point2D(3,6));

        List<Point2D> got = new ArrayList<>();
        got.add(new Point2D(4, 2));
        got.add(new Point2D(7, 2));
        got.add(new Point2D(8, 6));
        got.add(new Point2D(3, 6));
        got.add(new Point2D(2, 3));

        GrahamScan grahamScan = new GrahamScan();
        grahamScan.setAllPoints(given);
        grahamScan.countGrahamHull();
        Assertions.assertEquals(got, grahamScan.getPolygon());
    }

    @Test
    public void shouldNotChangeResultFor3PointList(){
        List<Point2D> given = new ArrayList<>();
        given.add(new Point2D(4,2));
        given.add(new Point2D(2,3));
        given.add(new Point2D(5,5));

        GrahamScan grahamScan = new GrahamScan();
        grahamScan.setAllPoints(given);
        grahamScan.countGrahamHull();
        Assertions.assertEquals(given, grahamScan.getPolygon());
    }

    @Test
    public void shouldReturnExceptionForEmptyList() {
        List<Point2D> given = new ArrayList<>();
        GrahamScan grahamScan = new GrahamScan();
        grahamScan.setAllPoints(given);
        String msg = "There must be at least 1 point";
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, grahamScan::countGrahamHull);
        Assertions.assertEquals(msg, exception.getMessage());
    }

    @Test
    public void shouldNotChangeResultFor2PointList() {
        List<Point2D> given = new ArrayList<>();
        given.add(new Point2D(4,2));
        given.add(new Point2D(2,3));
        GrahamScan grahamScan = new GrahamScan();
        grahamScan.setAllPoints(given);
        grahamScan.countGrahamHull();
        Assertions.assertEquals(given, grahamScan.getPolygon());
    }



}