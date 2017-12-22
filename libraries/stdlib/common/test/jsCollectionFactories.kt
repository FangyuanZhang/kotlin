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

package test.collections.js

public expect fun <V> stringMapOf(vararg pairs: Pair<String, V>): HashMap<String, V>
public expect fun <V> linkedStringMapOf(vararg pairs: Pair<String, V>): LinkedHashMap<String, V>
public expect fun stringSetOf(vararg elements: String): HashSet<String>
public expect fun linkedStringSetOf(vararg elements: String): LinkedHashSet<String>
