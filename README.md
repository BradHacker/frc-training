# FRC Team 5546 Java Training

Welcome to FRC Team 5546's Java training bootcamp. If you already have the correct dev environment set up, you cna skip the getting started. Otherwise please continue below **reading everything, not jsut skimming.**

## Latest Versions

| VSCode Version | WPILib Extension Version | JDK Version |
| :------------: | :----------------------: | :---------: |
|     1.30.1     |         alpha 4          |  OpenJDK 8  |

## Table Of Contents - Lesson 1

1. [Your First Subsystem](#your-first-subsystem)
   1. [DriveTrain](#drivetrain)
   2. [Motor Controllers](#motor-controllers)
2. [How To Continue](#how-to-continue)

## Prerequisites

- Read and Complete [Lesson 2](https://github.com/bradhacker/frc-training/tree/lesson1)
  - RobotMap.java
  - OI.java
  - Robot.java

## Your First Subsystem

Well, this is it, your first subsystem. Can you guess what it'll be? That's right, we will be making a `DriveTrain`. This will control the wheels via input from our two joysticks.

### DriveTrain

Create a new file in the `subsystems` folder called `DriveTrain.java`. In it, define the `DriveTrain` class as follows:

```java
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsytem {
    public DriveTrain() {
    }

    @Override
    public void initDefaultCommand() {
    }
}
```

### Motor Controllers

Now we will define some motors. But, our program can't just talk directly to our motors, so we use [motor controllers](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/599672-frc-control-system-hardware-overview#motor_controllers). These use [PWM](https://en.wikipedia.org/wiki/Pulse-width_modulation) to control the speed/direction of our motors. We will be using [VictorSP](https://www.vexrobotics.com/217-9090.html) motor controllers. So now we will define our left and right motor controllers:

```java
...
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.RobotMap;

public class DriveTrain extends Subsytem {
    private VictorSP leftSP, rightSP;

    public DriveTrain() {
        leftSP = new VictorSP(RobotMap.LEFT_MOTOR);
        rightSP = new VictorSP(RobotMap.RIGHT_MOTOR);
    }
    ...
```

## How To Continue

**Before moving on the next lesson, please ensure your code builds without error. If you are having issues please refollow each step or email me (Bradley Harker) for assistance.**

**To Ensure Your Code Builds:**

In VSCode, open WPILib command palette by clicking on the _red circle with the letter "w" in it_ that is located in the _upper right hand side of the VSCode window_. Then click the option that says `WPILib: Build Robot Code`.

If the console window says `BUILD SUCCESSFUL in Xs` where `X` is a number, then you may continue. If not, please refollow each step or email me (Bradley Harker) for assistance.

In VSCode, open the command prompt/terminal (**Windows:** press `Ctrl+~` or **Mac:** `Cmd+~`).

To continue the lessons, run the following command:

```shell
git checkout lesson4
```

Then, continue [here](https://github.com/BradHacker/frc-training/tree/lesson3) (not live yet, still WIP)
