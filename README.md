# FRC Team 5546 Java Training

Welcome to FRC Team 5546's Java training bootcamp. If you already have the correct dev environment set up, you cna skip the getting started. Otherwise please continue below **reading everything, not jsut skimming.**

## Latest Versions

| VSCode Version | WPILib Extension Version | JDK Version |
| :------------: | :----------------------: | :---------: |
|     1.30.1     |         alpha 4          |  OpenJDK 8  |

## Table Of Contents - Lesson 1

1. [First Things First](#first-things-first)
   1. [RobotMap](#robotmap)
   2. [OI](#oi)
   3. [Robot](#robot)
2. [How To Continue](#how-to-continue)

## Prerequisites

- Read [Lesson 1](https://github.com/bradhacker/frc-training/tree/lesson1)

## First Things First

First, let's create a basic robot program that has a drive train and can be controlled via tank drive (two joysticks, one controls left, one controls right).

### RobotMap

Open [RobotMap.java](./src/main/java/frc/robot/RobotMap.java) and add the left and right motor ports.

```java
...

public class RobotMap {
    public static final int LEFT_MOTOR = 1;
    public static final int RIGHT_MOTOR = 2;
}
```

Now add `LEFT_STICK` with the value `0` and `RIGHT_STICK` with the value `1` in the same way you did above.

### OI

Open [OI.java](./src/main/java/frc/robot/OI.java) and begin by adding the left and right sticks.

```java
...
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotMap;

public class OI {
    public Joystick leftStick = new Joystick(RobotMap.LEFT_STICK);
    public Joystick rightStick = new Joystick(RobotMap.RIGHT_STICK);
}
```

### Robot

Open [Robot.java](./src/main/java/frc/robot/Robot.java) and instantiate the OI.

```java
...
import frc.robot.OI;

public class Robot extends TimedRobot {
  public static OI oi;

  @Override
  public void robotInit() {
      oi = new OI();
  }
}
```

## How To Continue

In VSCode, open the command prompt/terminal (**Windows:** press `Ctrl+~` or **Mac:** `Cmd+~`).

To continue the lessons, run the following command:

```shell
git checkout lesson3
```
