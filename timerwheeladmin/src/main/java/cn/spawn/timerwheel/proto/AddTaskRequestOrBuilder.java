// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/timerwheel.proto

package cn.spawn.timerwheel.proto;

public interface AddTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.AddTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .model.DelayTaskModel delayTasks = 1;</code>
   */
  java.util.List<cn.spawn.timerwheel.proto.DelayTaskModel> 
      getDelayTasksList();
  /**
   * <code>repeated .model.DelayTaskModel delayTasks = 1;</code>
   */
  cn.spawn.timerwheel.proto.DelayTaskModel getDelayTasks(int index);
  /**
   * <code>repeated .model.DelayTaskModel delayTasks = 1;</code>
   */
  int getDelayTasksCount();
  /**
   * <code>repeated .model.DelayTaskModel delayTasks = 1;</code>
   */
  java.util.List<? extends cn.spawn.timerwheel.proto.DelayTaskModelOrBuilder> 
      getDelayTasksOrBuilderList();
  /**
   * <code>repeated .model.DelayTaskModel delayTasks = 1;</code>
   */
  cn.spawn.timerwheel.proto.DelayTaskModelOrBuilder getDelayTasksOrBuilder(
      int index);
}