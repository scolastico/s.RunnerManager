package me.scolastico.runner.manager.dataholders;

import java.util.HashMap;

public class Config {

  private boolean debug = false;
  private boolean useBash = false;
  private boolean deleteOfflineRunners = false;
  private boolean deleteOfflineRunnersOnlyWithTag = true;
  private String deleteOfflineRunnersWithTag = "autogenerated";
  private int containerRAM = -1;
  private int containerSWAP = -1;
  private int containerCPU = -1;
  private int checkEverySeconds = 15;
  private RunnerConfiguration[] runnerConfiguration = new RunnerConfiguration[]{new RunnerConfiguration()};
  private HashMap<String, CommandConfiguration> commandConfiguration = new HashMap<>(){{put("default", new CommandConfiguration());}};
  private String stopCommand = "docker rm %runnerName%";

  public String getStopCommand() {
    return stopCommand;
  }

  public void setStopCommand(String stopCommand) {
    this.stopCommand = stopCommand;
  }

  public HashMap<String, CommandConfiguration> getCommandConfiguration() {
    return commandConfiguration;
  }

  public void setCommandConfiguration(HashMap<String, CommandConfiguration> commandConfiguration) {
    this.commandConfiguration = commandConfiguration;
  }

  public boolean isUseBash() {
    return useBash;
  }

  public void setUseBash(boolean useBash) {
    this.useBash = useBash;
  }

  public int getCheckEverySeconds() {
    return checkEverySeconds;
  }

  public void setCheckEverySeconds(int checkEverySeconds) {
    this.checkEverySeconds = checkEverySeconds;
  }

  public boolean isDeleteOfflineRunnersOnlyWithTag() {
    return deleteOfflineRunnersOnlyWithTag;
  }

  public void setDeleteOfflineRunnersOnlyWithTag(boolean deleteOfflineRunnersOnlyWithTag) {
    this.deleteOfflineRunnersOnlyWithTag = deleteOfflineRunnersOnlyWithTag;
  }

  public String getDeleteOfflineRunnersWithTag() {
    return deleteOfflineRunnersWithTag;
  }

  public void setDeleteOfflineRunnersWithTag(String deleteOfflineRunnersWithTag) {
    this.deleteOfflineRunnersWithTag = deleteOfflineRunnersWithTag;
  }

  public boolean isDeleteOfflineRunners() {
    return deleteOfflineRunners;
  }

  public void setDeleteOfflineRunners(boolean deleteOfflineRunners) {
    this.deleteOfflineRunners = deleteOfflineRunners;
  }

  public int getContainerRAM() {
    return containerRAM;
  }

  public void setContainerRAM(int containerRAM) {
    this.containerRAM = containerRAM;
  }

  public int getContainerSWAP() {
    return containerSWAP;
  }

  public void setContainerSWAP(int containerSWAP) {
    this.containerSWAP = containerSWAP;
  }

  public int getContainerCPU() {
    return containerCPU;
  }

  public void setContainerCPU(int containerCPU) {
    this.containerCPU = containerCPU;
  }

  public RunnerConfiguration[] getRunnerConfiguration() {
    return runnerConfiguration;
  }

  public void setRunnerConfiguration(RunnerConfiguration[] runnerConfiguration) {
    this.runnerConfiguration = runnerConfiguration;
  }

  public boolean isDebug() {
    return debug;
  }

  public void setDebug(boolean debug) {
    this.debug = debug;
  }

}
