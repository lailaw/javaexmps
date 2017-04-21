// Ultrasonic1.java
// Poll ultrasonic sensor

import ch.aplu.raspisim.*;
import java.awt.Color;
import java.awt.Point;

public class Ultrasonic1
{
  public Ultrasonic1()
  {
    Robot robot = new Robot();
    Gear gear = new Gear();
    UltrasonicSensor us = new UltrasonicSensor();
    us.setBeamAreaColor(Color.green);
    us.setProximityCircleColor(Color.lightGray);
  
    gear.setSpeed(25);
    gear.forward();
    
    while (true)
    {
      double distance = us.getDistance();
      if (distance > 0 && distance < 50)
      {
        gear.backward(2000);
        gear.left(1000);
        gear.forward();
      }
    }
  }

  public static void main(String[] args)
  {
    new Ultrasonic1();
  }

   // ------------------ Environment --------------------------
  static
  {
    Point[] mesh_hbar =
    {
      new Point(200, 10), new Point(-200, 10),
      new Point(-200, -10), new Point(200, -10)
    };
    Point[] mesh_vbar =
    {
      new Point(10, 200), new Point(-10, 200),
      new Point(-10, -200), new Point(10, -200)
    };
    RobotContext.useTarget("sprites/bar0.gif", mesh_hbar, 250, 100);
    RobotContext.useTarget("sprites/bar0.gif", mesh_hbar, 250, 400);
    RobotContext.useTarget("sprites/bar1.gif", mesh_vbar, 100, 250);
    RobotContext.useTarget("sprites/bar1.gif", mesh_vbar, 400, 250);
  }

}
