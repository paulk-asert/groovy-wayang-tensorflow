/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
import groovy.swing.SwingBuilder

import javax.swing.*

class SwingUtil {
    private SwingUtil() {}

    static void show(JComponent component, JComponent... additionalComponents = []) {
        show([:], component, additionalComponents)
    }

    static void show(Map extraArgs, JComponent component, JComponent... additionalComponents = []) {
        showHV(extraArgs, "vbox", component, additionalComponents)
    }

    static void showH(Map extraArgs, JComponent component, JComponent... additionalComponents = []) {
        showHV(extraArgs, "hbox", component, additionalComponents)
    }

    private static void showHV(Map extraArgs, String direction, JComponent component, JComponent... additionalComponents = []) {
        Map frameArgs = [title: 'Frame', size: [800, 600], show: true, defaultCloseOperation: WindowConstants.DISPOSE_ON_CLOSE]
        frameArgs.putAll(extraArgs)
        new SwingBuilder().edt {
            frame(*:frameArgs) {
                "$direction" {
                    widget(component)
                    additionalComponents.each {
                        widget(it)
                    }
                }
            }
        }
    }

    static void showGrid(Map extraArgs, JComponent component, JComponent... additionalComponents = []) {
        Map frameArgs = [title: 'Frame', size: [800, 600], show: true, defaultCloseOperation: WindowConstants.DISPOSE_ON_CLOSE]
        def numCols = Math.ceil(Math.sqrt(1 + additionalComponents.size()))
        frameArgs.putAll(extraArgs)
        new SwingBuilder().edt {
            frame(*:frameArgs) {
                gridLayout(columns: numCols, rows: 0)
                widget(component)
                additionalComponents.each {
                    widget(it)
                }
            }
        }
    }
}
/* */
