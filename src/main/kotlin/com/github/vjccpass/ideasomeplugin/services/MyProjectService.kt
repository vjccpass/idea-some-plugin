package com.github.vjccpass.ideasomeplugin.services

import com.intellij.openapi.project.Project
import com.github.vjccpass.ideasomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
