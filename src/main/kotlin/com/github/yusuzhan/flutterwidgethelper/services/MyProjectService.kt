package com.github.yusuzhan.flutterwidgethelper.services

import com.github.yusuzhan.flutterwidgethelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
