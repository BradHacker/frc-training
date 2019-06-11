package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.RobotMap;

public class DriveTrain extends Subsystem {
  private VictorSP leftSP, rightSP;

  public DriveTrain() {
    leftSP = new VictorSP(RobotMap.LEFT_MOTOR);
    rightSP = new VictorSP(RobotMap.RIGHT_MOTOR);
  }

  @Override
  public void initDefaultCommand() {
  }
}