package com.github.georgecao.json2beanintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.georgecao.json2beanintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
