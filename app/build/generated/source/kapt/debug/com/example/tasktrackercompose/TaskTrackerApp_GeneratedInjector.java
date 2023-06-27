package com.example.tasktrackercompose;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = TaskTrackerApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface TaskTrackerApp_GeneratedInjector {
  void injectTaskTrackerApp(TaskTrackerApp taskTrackerApp);
}
