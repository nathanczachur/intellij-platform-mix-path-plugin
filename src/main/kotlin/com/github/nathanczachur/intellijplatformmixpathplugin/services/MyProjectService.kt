package com.github.nathanczachur.intellijplatformmixpathplugin.services

import com.intellij.openapi.project.Project
import com.github.nathanczachur.intellijplatformmixpathplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
