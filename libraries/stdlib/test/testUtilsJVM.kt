/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test

import kotlin.test.assertEquals

@JvmVersion
public fun assertTypeEquals(expected: Any?, actual: Any?) {
    assertEquals(expected?.javaClass, actual?.javaClass)
}


@kotlin.jvm.JvmVersion
private val isJava6 = System.getProperty("java.version").startsWith("1.6.")

@kotlin.jvm.JvmVersion
internal fun String.removeLeadingPlusOnJava6(): String =
        if (isJava6) removePrefix("+") else this

@kotlin.jvm.JvmVersion
internal fun doubleTotalOrderEquals(a: Any?, b: Any?) = a == b
