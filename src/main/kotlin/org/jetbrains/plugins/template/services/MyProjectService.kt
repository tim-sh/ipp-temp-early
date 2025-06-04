package org.jetbrains.plugins.template.services

import com.intellij.javascript.nodejs.interpreter.local.NodeJsLocalInterpreter
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project

@Service(Service.Level.PROJECT)
class MyProjectService(project: Project) {

    init {
        NodeJsLocalInterpreter("x")
    }

    fun getRandomNumber() = (1..100).random()

}
