<!-- markdownlint-disable MD033 -->

# FRC Team 5546 Java Training

Welcome to FRC Team 5546's Java training bootcamp. If you already have the correct dev environment set up, you cna skip the getting started. Otherwise please continue below **reading everything, not jsut skimming.**

## Latest Versions

| VSCode Version | WPILib Extension Version | JDK Version |
| :------------: | :----------------------: | :---------: |
|     1.30.1     |         alpha 4          |  OpenJDK 8  |

## Table Of Contents - Lesson 1

1. [Getting Familiar](#getting-familiar)
   1. [Robot.java](#robot.java)
      1. [robotInit() and robotPeriodic()](#robotinit-and-robotperiodic)
      2. [Other init() and periodic() methods](#other-init-and-periodic-methods)
   2. [OI.java](#oi.java)
   3. [RobotMap.java](#robotmap.java)
   4. [commands/ExampleCommand.java](#commandsexamplecommandjava)
      1. [Constructor](#constructor)
      2. [initialize()](#initialize)
      3. [execute()](#execute)
      4. [isFinished()](#isfinished)
      5. [end()](#end)
      6. [interrupted()](#interrupted)
   5. [subsystems/ExampleSubsystem.java](#subsystemsexamplesubsystemjava)
      1. [initDefaultCommand()](#initdefaultcommand)
2. [How To Continue](#how-to-continue)

## Prerequisites

- Followed [Getting Started](https://github.com/bradhacker/frc-training/tree/master) instructions
  - VSCode Installed
  - OpenJDK Installed
  - WPILib Installed

## Getting Familiar

If the `frc-training` folder isn't open in VSCode already, then open it by first opening VSCode and then going to File > Open Folder

**Windows Users:** should be in `C:/Users/%USERNAME%/Documents`

**Mac Users:** should be in `~/`

In order to get familiar with the FRC Java programming environemnt, we are going to take a look at some files.

### Robot.java

The [Robot](./src/main/java/frc/robot/Robot.java) class contians the main code that will be run by the robot. This is where all of the other pieces of our robot are instantiated and assigned.

#### robotInit() and robotPeriodic()

**robotiInit()** runs once when the robot starts up. Generally used for initialization code. **robotPeriodic()** is called periodically throughout the time the robot is on.

#### Other init() and periodic() methods

All other \*mode**\*Init()** and \*mode**\*Periodic()** functions are called once when the _mode_ is enabled and periodically when the _mode_ is enabled respectively.

### OI.java

This class is where we define all of the interfaces with our Driver Station (_i.e. Joysticks, Buttons, etc._). We also bind commands with button events like `.whenPressed` and `.whileHeld`.

### RobotMap.java

This class contains all **constants** which means all variables should be defined as:

<pre>public static final int <em>VARIABLE_NAME</em></pre>

These variables are the port numbers for all electronic interfaces on the roboRio (_e.g. `public static final int LEFT_MOTOR = 1`_).

### commands/ExampleCommand.java

#### Constructor

The constructor `public ExampleCommand() {...}` should contain a method call to `requires(...)` which accepts a subsystem from the `Robot` class as the only parameter. For example, if you want to require the drive train subsystem, you would:

```java
requires(Robot.drive_train);
```

#### initialize()

This method is called once when the command **first runs**. This means that after you call the command for the first time, this method will not run anymore until the robot restarts.

#### execute()

This method is called until `isFinished()` returns `true`.

#### isFinished()

When this method returns `true`, the command stops running.

#### end()

This method will run immediately after `isFinished()` returns `true`.

#### interrupted()

THis method is called when the command is interrupted. This should cancel any actions being done by the command to prevent unintended actions.

### subsystems/ExampleSubSystem.java

This is a subsystem. These are direct interfaces with the outputs of your robot. For example, you would have a `DriveTrain` subsystem that directly controls your motors.

#### initDefaultCommand()

This should contain a call to `setDefaultCommand(...)` that contains a command which will be called periodically throughout operation. Going with the `DriveTrain` example, this should contain `setDefaultCommand(new Drive())`. `Drive()` would be a command that maps the joystick values to a method contained in the `DriveTrain` class.

## How To Continue

In VSCode, open the command prompt/terminal (**Windows:** press `Ctrl+~` or **Mac:** `Cmd+~`).

To continue the lessons, run the following command:

```shell
git checkout lesson2
```

Then, continue [here](https://github.com/BradHacker/frc-training/tree/lesson2)
