package org.jetbrains.plugins.template

import com.intellij.javascript.nodejs.interpreter.local.NodeJsLocalInterpreter
import com.intellij.testFramework.TestDataPath
import com.intellij.testFramework.fixtures.BasePlatformTestCase

@TestDataPath("\$CONTENT_ROOT/src/test/testData")
class MyPluginTest : BasePlatformTestCase() {

    fun testNLI() {
        NodeJsLocalInterpreter("x")
    }

    override fun getTestDataPath() = "src/test/testData/rename"
}
